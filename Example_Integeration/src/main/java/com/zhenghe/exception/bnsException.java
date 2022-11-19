package com.zhenghe.exception;

public class bnsException extends RuntimeException{
    private Integer code;

    public bnsException(Integer code) {
        this.code = code;
    }

    public bnsException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public bnsException(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

