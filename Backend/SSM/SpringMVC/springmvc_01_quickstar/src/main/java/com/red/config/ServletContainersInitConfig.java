package com.red.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * 定义一个Servlet容器的启动的配置类,在里面加载spring的配置
 */
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    /**
     * 让tomcat服务器启动的时候加载springMVC容器的配置
     * @return
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
//        获取web应用上下文
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        注册springMVC配置
        context.register(SpringMVCConfig.class);
        return context;
    }

    @Override
    protected String[] getServletMappings() {
//        设置所有请求归springMVC管理
        return new String[]{"/"};
    }

    /**
     * 加载spring容器的配置
     * @return
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
