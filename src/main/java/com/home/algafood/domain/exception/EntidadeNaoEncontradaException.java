package com.home.algafood.domain.exception;

public class EntidadeNaoEncontradaException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public EntidadeNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}
