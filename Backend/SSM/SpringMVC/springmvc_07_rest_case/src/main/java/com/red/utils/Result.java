package com.red.utils;

import lombok.Data;

/**
 * 必须提供getter方法,springmvc的json格式转换器才能进行获取java对象的属性值完成json的转换
 * @param <T>
 */
@Data
public class Result<T> {
    private Boolean isSuccess;
    private T data;
    private String message;

    private Result(Boolean isSuccess, T data, String message) {
        this.isSuccess = isSuccess;
        this.data = data;
        this.message = message;
    }

    public static <T> Result<T> ok(T data,String message){
        return new Result<>(true,data,message);
    }

    public static <T> Result<T> ok(T data){
        return new Result<>(true,data,null);
    }

    public static <T> Result<T> fail(String message){
        return new Result<>(false,null,message);
    }
}
