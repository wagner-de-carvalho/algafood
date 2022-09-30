package com.home.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.home.algafood.AlgafoodApiApplication;
import com.home.algafood.domain.model.Cozinha;
import com.home.algafood.infrastructure.repository.CozinhaRepositoryImpl;

public class ConsultaCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CozinhaRepositoryImpl cozinhaRepository = applicationContext.getBean(CozinhaRepositoryImpl.class);
		List<Cozinha> cozinhas = cozinhaRepository.listar();
		cozinhas.forEach(e -> System.out.println(e.getId() + ": " + e.getNome()));
	}

}
