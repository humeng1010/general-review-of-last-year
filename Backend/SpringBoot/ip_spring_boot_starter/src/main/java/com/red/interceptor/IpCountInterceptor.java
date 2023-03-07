package com.red.interceptor;

import com.red.properties.IpProperties;
import com.red.service.IpCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Component
public class IpCountInterceptor implements HandlerInterceptor {

    @Autowired
    private IpCountService ipCountService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        ipCountService.count();
        return true;
    }
}
