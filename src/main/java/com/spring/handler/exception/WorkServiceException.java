package com.spring.handler.exception;

public class WorkServiceException extends RuntimeException{

    private static final long serialVersionUID = 23980132812234567L;

    public WorkServiceException(String message){
        super(message);
    }
}
