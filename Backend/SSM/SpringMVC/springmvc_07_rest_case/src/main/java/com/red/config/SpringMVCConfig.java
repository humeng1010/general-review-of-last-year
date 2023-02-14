package com.red.config;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@ComponentScan("com.red.controller")
@EnableWebMvc
public class SpringMVCConfig implements WebMvcConfigurer {
    /**
     * 配置对象转json的规则 序列化时忽略null属性
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        创建 映射json to http消息转换器
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        创建对象映射
        ObjectMapper mapper = new ObjectMapper();
//        设置序列化包含规则 JsonInclude.Include.NON_NULL:列化时只包含非空的属性
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        converter.setObjectMapper(mapper);
        converters.add(converter);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当访问/pages/*的时候不走mvc请求,走/pages目录下的资源
        registry.addResourceHandler("/index.html")
                .addResourceLocations("/index.html");
    }
}
