package br.com.fiap.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setMedia(10);
		aluno.setNome("fabio");
		aluno.setTurma("123");
		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		Map<String, Object> req = ((BindingProvider)port).getRequestContext();
		Map<String,List<String>> headers = new HashMap<String, List<String>>();
		
		headers.put("Username", Collections.singletonList("fabio"));
		headers.put("Senha", Collections.singletonList("123"));
		req.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		try {
			System.out.println(port.novo(aluno));
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}
	}
	

}
