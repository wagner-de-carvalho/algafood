package com.home.algafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.algafood.domain.exception.EntidadeNaoEncontrada;
import com.home.algafood.domain.model.Cozinha;
import com.home.algafood.domain.model.Restaurante;
import com.home.algafood.domain.repository.CozinhaRepository;
import com.home.algafood.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private CozinhaRepository cozinhaRepository;

    public Restaurante salvar(Restaurante restaurante) {
        Long cozinhaId = restaurante.getCozinha().getId();
        Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);

        if (cozinha == null) {
            String mensagem = String.format("Não existe cadastro de cozinha com o código %d", cozinhaId);
            throw new EntidadeNaoEncontrada(mensagem);
        }

        restaurante.setCozinha(cozinha);

        return restauranteRepository.salvar(restaurante);
    }
}
