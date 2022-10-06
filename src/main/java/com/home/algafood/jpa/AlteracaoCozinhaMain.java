package com.home.algafood.jpa;

import com.home.algafood.domain.model.Cozinha;

public class AlteracaoCozinhaMain {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
//                .web(WebApplicationType.NONE).run(args);

//		CozinhaRepositoryImpl cozinhaRepository = applicationContext.getBean(CozinhaRepositoryImpl.class);

        Cozinha c1 = new Cozinha();
        c1.setId(1L);
        c1.setNome("Chinesa");

//		cozinhaRepository.salvar(c1);

    }
}
