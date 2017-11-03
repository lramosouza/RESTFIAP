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

@WebService(name = "FornecedorServiceSOAP")
public class FornecedorServiceSOAP {
	
	@Resource 
	WebServiceContext wsctx;
	
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
			
			int cont = 0;
			
			if (Util.isAutenticado(username, password)) {
				
				for(Pedido pedido: listaPedidos) {
				
					for(Produto produto: produtos) {
						
						if(pedido.getCodProduto() == produto.getCodProduto()) {
							
							cont++;
							
							if(cont == listaPedidos.size()) {
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
