package com.red.config;

import com.red.controller.interceptor.BookInterceptor;
import com.red.controller.interceptor.LoginInterceptor;
import com.red.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class SpringWebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Autowired
    private LoginInterceptor loginInterceptor;
    @Autowired
    private BookInterceptor bookInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/*");
        registry.addInterceptor(loginInterceptor).addPathPatterns("/*").excludePathPatterns("/login");
        registry.addInterceptor(bookInterceptor).addPathPatterns("/books","/books/*");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/abc.html").addResourceLocations("/abc.html");
    }
}
