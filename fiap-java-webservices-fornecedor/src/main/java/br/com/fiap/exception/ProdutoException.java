package br.com.fiap.exception;

public class ProdutoException extends Exception {
		
	public ProdutoException(String message) {
		 super(message);
	}

	public ProdutoException(String message, Exception e) {
		super(message, e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
