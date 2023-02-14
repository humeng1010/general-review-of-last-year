package com.red.controller.exception;

import com.red.utils.Result;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理类
 */
@RestControllerAdvice
public class ExceptionHandler {


    @org.springframework.web.bind.annotation.ExceptionHandler(SystemException.class)
    public Result<String> doSystemException(SystemException e){

        return Result.fail("系统错误"+e.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public Result<String> doException(Exception e){
        e.printStackTrace();
        return Result.fail("服务器繁忙请稍后再试o(╥﹏╥)o");
    }


}
