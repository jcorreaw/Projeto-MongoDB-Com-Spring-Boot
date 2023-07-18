package com.estudo.projeto.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
