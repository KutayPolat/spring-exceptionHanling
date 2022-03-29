package com.spring.handler.exception;

import com.spring.handler.response.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class EntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handlerAnyException(Exception ex, WebRequest request){

        String exceptionMessageDetail = ex.getLocalizedMessage();
        if (exceptionMessageDetail == null) exceptionMessageDetail = ex.toString();

        ErrorMessage errorMessage = new ErrorMessage(exceptionMessageDetail,new Date());
        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //for specific exception change value and ex type from general to specific one

    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<Object> handleNullPointException(NullPointerException ex, WebRequest request){

        String exceptionMessageDetail = ex.getLocalizedMessage();
        if (exceptionMessageDetail == null) exceptionMessageDetail = ex.toString();

        ErrorMessage errorMessage = new ErrorMessage(exceptionMessageDetail,new Date());
        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
