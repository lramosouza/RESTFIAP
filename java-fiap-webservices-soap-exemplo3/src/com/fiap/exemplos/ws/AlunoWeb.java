package com.fiap.exemplos.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class AlunoWeb {
	private List<Aluno> alunos;
	
	@Resource
	WebServiceContext wsctx;
	
	public AlunoWeb() {
		alunos = new ArrayList<Aluno>();
	}
	@WebMethod
	public String novo(Aluno a) throws Exception {
		if(isAutenticado()){
			alunos.add(a);
			return "Sucesso. Feicidade";
		}else{
			throw new Exception("Usuário ou senha inválidos");
		}
	}

	@WebMethod
	public List<Aluno> listar() {
			return this.alunos;
	}
	
	public boolean isAutenticado(){
		MessageContext mctx = wsctx.getMessageContext();
		Map header = (Map)mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		List usuarios = (List) header.get("username");
		List senhas = (List) header.get("senha");
		String usuario = usuarios.get(0).toString();
		String senha = senhas.get(0).toString();
		
		if ("fabio".equals(usuario) && "123".equals(senha)) {
			return Boolean.TRUE;
		}else{
			return Boolean.FALSE;
		}
	}

}
