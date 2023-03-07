package com.red.config;

import com.red.interceptor.IpCountInterceptor;
import com.red.properties.IpProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    private IpCountInterceptor interceptor;
    @Autowired
    private IpProperties properties;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns(properties.getPath()).excludePathPatterns(properties.getExcludePath());
    }
}
