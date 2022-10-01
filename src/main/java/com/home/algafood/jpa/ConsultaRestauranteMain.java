package com.home.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.home.algafood.AlgafoodApiApplication;
import com.home.algafood.domain.model.Restaurante;
import com.home.algafood.infrastructure.repository.RestauranteRepositoryImpl;

public class ConsultaRestauranteMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		RestauranteRepositoryImpl restauranteRepository = applicationContext.getBean(RestauranteRepositoryImpl.class);
		List<Restaurante> restaurantes = restauranteRepository.listar();
		restaurantes.forEach(e -> System.out.println(e.getId() + ": " + e.getNome() + ", frete: " + e.getTaxaFrete()));
	}

}
