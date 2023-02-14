package com.red.controller.exception;

public class SystemException extends RuntimeException{
    private Integer status;

    public SystemException(Integer status,String message) {
        super(message);
        this.status = status;
    }

    public SystemException(Integer status,String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

}
