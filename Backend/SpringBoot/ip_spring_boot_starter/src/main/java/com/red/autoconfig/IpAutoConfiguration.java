package com.red.autoconfig;


import com.red.config.SpringMvcConfig;
import com.red.interceptor.IpCountInterceptor;
import com.red.properties.IpProperties;
import com.red.service.IpCountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//开启定时任务功能
//需要手动给该类指定名称方便取出数据
//使用这个@EnableConfigurationProperties注解把加载配置文件的class注册为bean的名称不是我们想要的
//@EnableConfigurationProperties(IpProperties.class)
//引入IpProperties类到spring容器中作为bean
@Import({IpProperties.class, IpCountInterceptor.class, SpringMvcConfig.class})
public class IpAutoConfiguration {
    @Bean
    public IpCountService ipCountService(){
        return new IpCountService();
    }
}
