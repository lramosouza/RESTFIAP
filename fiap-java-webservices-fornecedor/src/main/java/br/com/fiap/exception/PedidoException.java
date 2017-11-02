package br.com.fiap.exception;

public class PedidoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public PedidoException(String message) {
		 super(message);
	}
	
	public PedidoException(String message, Exception e) {
		super(message, e);
	}

}
