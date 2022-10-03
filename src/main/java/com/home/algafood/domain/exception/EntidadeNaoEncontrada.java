package com.home.algafood.domain.exception;

public class EntidadeNaoEncontrada extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public EntidadeNaoEncontrada(String mensagem) {
        super(mensagem);
    }
}
