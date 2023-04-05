package com.module.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Boolean isSuccess;
    private Object data;
    private String message;


    public static Result ok(){
        return new Result(true,null,null);
    }

    public static Result ok(Object data){
        return new Result(true,data,null);
    }

    public static Result ok(Object data,String message){
        return new Result(true,data,message);
    }

    public static Result fail(String message){
        return new Result(false,null,message);
    }


}
