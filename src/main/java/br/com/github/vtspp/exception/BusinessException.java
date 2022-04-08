package br.com.github.vtspp.exception;

import java.io.Serializable;

public class BusinessException extends RuntimeException implements Serializable {

    public BusinessException(String message) {
        super(message);
    }
}