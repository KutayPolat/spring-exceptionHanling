package com.spring.handler.response;

import java.util.Date;

public class ErrorMessage {

    private String errorMessage;
    private Date time;

    public ErrorMessage(String errorMessage, Date time) {
        this.errorMessage = errorMessage;
        this.time = time;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
