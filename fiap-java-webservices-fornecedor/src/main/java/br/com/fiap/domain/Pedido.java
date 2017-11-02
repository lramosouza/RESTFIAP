package br.com.fiap.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Pedido() {
		
	}
	
	public Pedido(String cpfCnpj, int codProduto, String descricao, BigDecimal valor) {
		super();
		this.codProduto = codProduto;
		this.descricao =  descricao;
		this.valor = valor;
	}
	
	private int codProduto;
	private String descricao;
	private BigDecimal valor;

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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
