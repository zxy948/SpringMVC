package com.Proj.Ctrl;


import com.Proj.exception.MydoException;
import com.Proj.exception.bnsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 代表处理REST风格的controller
 */
@RestControllerAdvice
public class ProjExceptionAdvice {

    /**
     * 处理系统异常
     * @param mydoException
     * @return
     */
    @ExceptionHandler(MydoException.class)
    public Result MydoException(MydoException mydoException){
        //记录日志
        //发送消息给运维
        //发送运维提示信息
        return new Result(mydoException.getCode(),null,mydoException.getMessage());
    }

    /**
     * 处理其他异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result doExcepton(Exception e){
        System.out.println("处理异常");
        return new Result(Code.SYS_UNKNOWN_ERR,null,"其他异常信息");
    }

    /**
     * 处理业务异常
     * @param be
     * @return
     */
    @ExceptionHandler(bnsException.class)
    public Result bnsException(bnsException be){
        //记录日志
        return new Result(be.getCode(), null,"系统繁忙，请稍后再试");
    }



}

