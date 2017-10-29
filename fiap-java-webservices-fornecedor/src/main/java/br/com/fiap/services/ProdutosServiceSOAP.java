package br.com.fiap.services;

import java.util.ArrayList;
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
	
	static List<Produto> produtos = null;
	
	static {
		produtos = new ArrayList<Produto>();
        
        Produto produto1 = new Produto();
        produto1.setCodProduto(0001);
        produto1.setDescricao("DVD-Player");
        produto1.setQtdEstoque(100);
        produto1.setValor(Util.toBigDecimal(350));
        produto1.setProdutoDisponivel(true);

        Produto produto2 = new Produto();
        produto2.setCodProduto(0002);
        produto2.setDescricao("Galaxy Note 8");
        produto2.setQtdEstoque(120);
        produto2.setValor(Util.toBigDecimal(5200));
        produto2.setProdutoDisponivel(true);

        Produto produto3 = new Produto();
        produto3.setCodProduto(0003);
        produto3.setDescricao("JBL Flip 4 Speaker");
        produto3.setQtdEstoque(30);
        produto3.setValor(Util.toBigDecimal(500));
        produto3.setProdutoDisponivel(true);
        
        Produto produto4 = new Produto();
        produto4.setCodProduto(0004);
        produto4.setDescricao("Beats Headphone");
        produto4.setQtdEstoque(40);
        produto4.setValor(Util.toBigDecimal(850));
        produto4.setProdutoDisponivel(true);
        
        Produto produto5 = new Produto();
        produto5.setCodProduto(0005);
        produto5.setDescricao("iPhone 7 Plus 64 GB");
        produto5.setQtdEstoque(0);
        produto5.setValor(Util.toBigDecimal(3500));
        produto5.setProdutoDisponivel(false);
        
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
    }
	
	
	@WebMethod
	public List<Produto> listarProdutos(@WebParam(name="Username", header = true) String username,
										@WebParam(name="Password", header = true) String password) throws ProdutoException{
				
		try {
			if (isAutenticado(username, password)){
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
	public boolean isAutenticado(String usuario, String senha){
		boolean res = Boolean.FALSE;
		
		if ("forn".equals(usuario) && "forn".equals(senha)){
			 res = Boolean.TRUE;
		}
		
		return res;
	}

		
}
