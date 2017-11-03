package br.com.fiap.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Produto() {

	}
	
		
	public Produto(int codProduto, String descricao, int qtdEstoque, BigDecimal valor, boolean isProdutoDisponivel) {
		super();
		this.codProduto = codProduto;
		this.descricao = descricao;
		this.qtdEstoque = qtdEstoque;
		this.valor = valor;
		this.isProdutoDisponivel = isProdutoDisponivel;
	}


	private int codProduto;
	private String descricao;
	private int qtdEstoque;
	private BigDecimal valor;
	private boolean isProdutoDisponivel;

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public boolean isProdutoDisponivel() {
		return isProdutoDisponivel;
	}

	public void setProdutoDisponivel(boolean isProdutoDisponivel) {
		this.isProdutoDisponivel = isProdutoDisponivel;
	}

}
