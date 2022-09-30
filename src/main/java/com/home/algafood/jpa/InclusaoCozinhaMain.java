package com.home.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.home.algafood.AlgafoodApiApplication;
import com.home.algafood.domain.model.Cozinha;

public class InclusaoCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

		Cozinha c1 = new Cozinha();
		c1.setNome("Brasileira");
		Cozinha c2 = new Cozinha();
		c2.setNome("Japonesa");
		
		cadastroCozinha.adicionar(c1);
		cadastroCozinha.adicionar(c2);

	}
}
