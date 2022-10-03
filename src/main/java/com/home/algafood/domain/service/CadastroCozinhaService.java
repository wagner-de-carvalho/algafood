package com.home.algafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.home.algafood.domain.exception.EntidadeEmUsoException;
import com.home.algafood.domain.exception.EntidadeNaoEncontrada;
import com.home.algafood.domain.model.Cozinha;
import com.home.algafood.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {
    @Autowired
    private CozinhaRepository cozinhaRepository;

    public Cozinha salvar(Cozinha cozinha) {
        return cozinhaRepository.salvar(cozinha);
    }

    public void excluir(Long cozinhaId) {
        try {
            cozinhaRepository.remover(cozinhaId);
        } catch (EmptyResultDataAccessException e) {
            String mensagem = String.format("Não existe cadastro de cozinha com o código %d", cozinhaId);
            throw new EntidadeNaoEncontrada(mensagem);
        } catch (DataIntegrityViolationException e) {
            String mensagem = String.format("Cozinha de código %d não pode ser removida pois está em uso", cozinhaId);
            throw new EntidadeEmUsoException(mensagem);
        }
    }

}
