package br.com.fiap.services;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import br.com.fiap.domain.Produto;
import br.com.fiap.exception.ProdutoException;
import br.com.fiap.util.Util;

@WebService(name = "ProdutosServiceSOAP")
public class ProdutosServiceSOAP {
	
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
			} else {
				throw new ProdutoException("Usuário não possui permissão para consultar produtos");
			}
		} catch (Exception e) {
			throw new ProdutoException("Erro ao consultar produtos: "+e.getMessage(), e);
		}
				
	}
	
}
