package com.red.autoconfig;


import com.red.service.IpCountService;
import org.springframework.context.annotation.Bean;

public class IpAutoConfiguration {
    @Bean
    public IpCountService ipCountService(){
        return new IpCountService();
    }
}
