package com.home.algafood.jpa;

import com.home.algafood.domain.model.Cozinha;

public class InclusaoCozinhaMain {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
//                .web(WebApplicationType.NONE).run(args);

//		CozinhaRepositoryImpl cozinhaRepository = applicationContext.getBean(CozinhaRepositoryImpl.class);

        Cozinha c1 = new Cozinha();
        c1.setNome("Brasileira");
        Cozinha c2 = new Cozinha();
        c2.setNome("Japonesa");

//		cozinhaRepository.salvar(c1);
//		cozinhaRepository.salvar(c2);

    }
}
