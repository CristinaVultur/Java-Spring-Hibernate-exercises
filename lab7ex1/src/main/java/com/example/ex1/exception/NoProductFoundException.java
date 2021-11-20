package com.example.ex1.exception;

public class NoProductFoundException extends RuntimeException{
    public NoProductFoundException(String exceptionMsg){
        super(exceptionMsg);
    }
}
