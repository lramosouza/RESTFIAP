package br.com.fiap.services;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import br.com.fiap.domain.Pedido;
import br.com.fiap.domain.Produto;
import br.com.fiap.exception.PedidoException;
import br.com.fiap.exception.ProdutoException;
import br.com.fiap.util.Util;
import br.com.fiap.ws.client.financeiro.CobrancaRequest;
import br.com.fiap.ws.client.financeiro.CobrancaRequestPojo;
import br.com.fiap.ws.client.financeiro.FinanceiroWebService;
import br.com.fiap.ws.client.financeiro.FinanceiroWebServiceService;
import br.com.fiap.ws.client.governo.Document;
import br.com.fiap.ws.client.governo.Generate;
import br.com.fiap.ws.client.governo.Invoice;
import br.com.fiap.ws.client.governo.InvoiceRequest;
import br.com.fiap.ws.client.governo.Invoice_Service;

@WebService(name = "FornecedorServiceSOAP")
public class FornecedorServiceSOAP {
	
	@Resource 
	WebServiceContext wsctx;
	
	Invoice portGoverno;
	FinanceiroWebService portFinanceiro;
	
	@WebMethod
	public List<Produto> listarProdutos(@WebParam(name="Username", header = true) String username,
										@WebParam(name="Password", header = true) String password) throws ProdutoException{
				
		try {
			List<Produto> produtos = Util.listaProdutos();
			
			if (Util.isAutenticado(username, password)){
				System.out.println(produtos);
				return produtos;
			}else{
				throw new ProdutoException("Usuário não possui permissão para consultar produtos");
			}
		} catch (Exception e) {
			throw new ProdutoException("Erro ao consultar produtos: "+e.getMessage(), e);
		}
				
	}

	
	@WebMethod
	public String efetuarPedido(@WebParam(name="Username", header = true) String username,
									@WebParam(name="Password", header = true) String password, 
									@WebParam(name="cpfCnpj", header = false) String cpfCnpj,
									@WebParam(name="pedido", header = false) List<Pedido> pedidos) throws PedidoException{
		
		try {
			
			List<Pedido> listaPedidos = pedidos;
			
			List<Produto> produtos = Util.listaProdutos();
			
			//Governo
			portGoverno =  new Invoice_Service().getInvoicePort();
			//Financeiro
			portFinanceiro = new FinanceiroWebServiceService().getFinanceiroWebServicePort();
			
			int cont = 0;
			
			double valorTotalPedido = 0;
			
			if (Util.isAutenticado(username, password)) {
				
				for(Pedido pedido: listaPedidos) {
				
					for(Produto produto: produtos) {
						
						if(pedido.getCodProduto() == produto.getCodProduto()) {
							
							cont++;
							
							valorTotalPedido += produto.getValor().doubleValue();
							
							if(cont == listaPedidos.size()) {
								
								//Serviço Governo
								Generate g = new Generate();
								Document doc =  new Document();
								doc.setType(br.com.fiap.ws.client.governo.Type.CPF);
								doc.setValue(cpfCnpj);
								InvoiceRequest invoice = new InvoiceRequest();
								invoice.setDocument(doc);
								invoice.setValue(valorTotalPedido);
								g.setArg0(invoice) ;
								portGoverno.generate(g, "transportadora", "transportadora");
																
								//Serviço Financeiro
								CobrancaRequestPojo cobranca = new CobrancaRequestPojo();
								cobranca.setCpfCnpj(cpfCnpj);
								cobranca.setValor(valorTotalPedido);
								CobrancaRequest cobrancaRequest = new CobrancaRequest();
								cobrancaRequest.setCobranca(cobranca);
								portFinanceiro.cobranca(cobrancaRequest);
								
								return "Pedido efetuado com sucesso!";
							}
						}
					}
				}
				
			
			} else {
				
				throw new PedidoException("Usuário não possui permissão para efetuar o pedido.");
			}
			
			
		} catch (Exception e) {
			
			throw new PedidoException("Erro ao efetuar o pedido: "+e.getMessage(), e);
		
		}
		
		throw new PedidoException("Não foi possível efetuar o pedido. Produto em falta!");
		
	}
		
}
