package br.com.fiap.services;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import br.com.fiap.domain.Pedido;

@WebService(name = "PedidoServiceSOAP")
public class PedidoServiceSOAP {
	
	@Resource 
	WebServiceContext wsctx;
	
	@WebMethod
	public boolean processarPedido(@WebParam(name="cpfCnpj", header = false) String cpfCnpj,
			@WebParam(name="pedido", header = false) List<Pedido> pedido) {
		
		
		return true;
	}
	
}
