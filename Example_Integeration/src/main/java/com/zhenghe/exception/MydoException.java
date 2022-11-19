package com.zhenghe.exception;

public class MydoException extends RuntimeException{
    private Integer code;

    public MydoException(Integer code) {
        this.code = code;
    }

    public MydoException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public MydoException(Integer code,String message, Throwable cause) {
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

