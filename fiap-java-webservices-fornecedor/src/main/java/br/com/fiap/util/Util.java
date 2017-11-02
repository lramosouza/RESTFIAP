package br.com.fiap.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.domain.Produto;

public class Util {
	
	public static BigDecimal toBigDecimal(int valor){

		return new BigDecimal(valor);
	}
	
	public static List<Produto> listaProdutos(){
		
		List<Produto> listaProdutos =  new ArrayList<Produto>();
        
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
        
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);
        
        return listaProdutos;
	}

}
