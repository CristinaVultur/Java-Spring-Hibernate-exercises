package com.example.ex1.exception;

public class NoSufficientQuantityException extends RuntimeException {
    public NoSufficientQuantityException(String exceptionMsg){
        super(exceptionMsg);
    }
}
