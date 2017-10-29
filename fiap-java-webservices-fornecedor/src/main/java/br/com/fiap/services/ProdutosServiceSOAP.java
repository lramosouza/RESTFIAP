package br.com.fiap.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.fiap.domain.Produto;
import br.com.fiap.exception.ProdutoException;
import br.com.fiap.util.Util;

@WebService(name = "ProdutosServiceSOAP")
public class ProdutosServiceSOAP {
	
	static List<Produto> produtos = null;
	
	static {
		produtos = new ArrayList<Produto>();
        
        Produto produto1 = new Produto();
        produto1.setCodProduto(1);
        produto1.setDescricao("Teste produto 1");
        produto1.setQtdEstoque(10);
        produto1.setValor(Util.toBigDecimal(100));

        Produto produto2 = new Produto();
        produto2.setCodProduto(2);
        produto2.setDescricao("Teste produto 2");
        produto2.setQtdEstoque(20);
        produto2.setValor(Util.toBigDecimal(200));

        Produto produto3 = new Produto();
        produto3.setCodProduto(3);
        produto3.setDescricao("Teste produto 3");
        produto3.setQtdEstoque(30);
        produto3.setValor(Util.toBigDecimal(300));
        
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
    }
	
	@WebMethod
	public List<Produto> listarProdutos() throws ProdutoException{
				
		try {
			System.out.println(produtos.toString());
			return produtos;
		} catch (Exception e) {
			throw new ProdutoException();
		}
				
	}

		
}
