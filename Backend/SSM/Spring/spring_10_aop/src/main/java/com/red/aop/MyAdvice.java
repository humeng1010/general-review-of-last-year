package com.red.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.red.dao.BookDao.*())")
    private void pt(){}

    /*@Before("pt()")
    public void before(){
        System.out.println(System.currentTimeMillis());
    }
    @After("pt()")
    public void after(){
        System.out.println(System.currentTimeMillis());
    }*/
    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String typeName = signature.getDeclaringTypeName();
        String name = signature.getName();
        System.out.println(typeName+" "+name);
        System.out.println(System.currentTimeMillis());
        Object res = pjp.proceed();
        System.out.println(System.currentTimeMillis());
        return res;
    }
}
