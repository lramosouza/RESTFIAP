package com.fiap.exemplos.ws2;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public class AlunoAuthWeb {
	private List<AlunoAuth> alunos;

	public AlunoAuthWeb() {
		alunos = new ArrayList<AlunoAuth>();
	}
	@WebMethod
	public String novo(@WebParam(name="Aluno",header=false)AlunoAuth a,
						@WebParam(name="Usuario", header=true) String usuario,
						@WebParam(name="Senha",header=true)String senha) throws Exception {
		if(isAutenticado(usuario, senha)){
			alunos.add(a);
			return "Sucesso. Feicidade";
		}else{
			throw new Exception("Usuário ou senha inválidos");
		}
	}

	@WebMethod
	public List<AlunoAuth> listar(@WebParam(name="Aluno",header=false)AlunoAuth a,
			@WebParam(name="Usuario", header=true) String usuario,
			@WebParam(name="Senha",header=true)String senha) throws Exception {
		if(isAutenticado(usuario, senha)) {
			return this.alunos;
		}else{
	       return null;
	   }
	}
	
	public boolean isAutenticado(String usuario, String senha){

		if ("fabio".equals(usuario) && "123".equals(senha)) {
			return Boolean.TRUE;
		}else{
			return Boolean.FALSE;
		}
	}


}
