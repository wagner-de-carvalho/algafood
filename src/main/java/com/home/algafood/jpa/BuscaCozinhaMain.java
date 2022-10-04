package com.home.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.home.algafood.AlgafoodApiApplication;
import com.home.algafood.domain.model.Cozinha;

public class BuscaCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

//		CozinhaRepositoryImpl cozinhaRepository = applicationContext.getBean(CozinhaRepositoryImpl.class);
//		Cozinha cozinha = cozinhaRepository.buscar(1L);
//		System.out.println(cozinha.getId() + ": " + cozinha.getNome());

	}

}
