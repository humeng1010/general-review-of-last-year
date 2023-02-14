package com.red.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.red.controller"})
@Import({SpringWebMvcConfig.class})
//SpringMVC需要开启WebMvc配置拦截器才有效
@EnableWebMvc
public class SpringMVCConfig{
}
