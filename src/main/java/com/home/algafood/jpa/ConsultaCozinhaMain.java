package com.home.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.home.algafood.AlgafoodApiApplication;
import com.home.algafood.domain.model.Cozinha;

public class ConsultaCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		List<Cozinha> cozinhas = cadastroCozinha.listar();
		cozinhas.forEach(e -> System.out.println(e.getId() + ": " + e.getNome()));
	}

}
