package com.home.algafood.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

	ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso"),
	RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrado", "Recurso não encontrado"),
	ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio"),
	MENSAGEM_INCOMPREENSIVEL("mensagem-incompreensivel", "Mensagem incompreensível"),
	PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro inválido"); 
	

	private String title;
	private String uri;

	ProblemType(String path, String title) {
		this.uri = "http://localhost:8081" + path;
		this.title = title;
	}
}
