package com.red.service;

import com.red.properties.IpProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class IpCountService {
    private final Map<String,Integer> ipCountMap = new HashMap<>();

    @Autowired
    //当前的request对象的注入工作由使用当前starter的工厂提供自动装配
    private HttpServletRequest httpServletRequest;
    public void count(){
        // 每次调用这个方法就记录当前访问的ip,然后累加访问次数
//        1.获取当前操作的ip地址
        String ip = httpServletRequest.getRemoteAddr();

//        log.info("当前访问的ip:{}",ip);
//        2.根据当前的ip地址从map中取值,然后递增
        Integer count = ipCountMap.get(ip);
        if (count == null){
            ipCountMap.put(ip,1);
        }else {
            ipCountMap.put(ip,count + 1);
        }

    }

    @Autowired
    private IpProperties properties;

    /**
     * 打印ip方法,使用springboot内置的定时任务,每隔5秒执行一次
     */
//    @Scheduled(cron = "0/${tools.ip.cycle:5} * * * * ?")
    @Scheduled(cron = "0/#{ipProperties.cycle} * * * * ?")
    public void print(){
        if (properties.getModel().equals(IpProperties.LogModel.DETAIL.getValue())){
            // 详细模式
            ipCountMap.forEach((k,v)->{
                log.info("ip:{};count{}",k,v);
            });
        }else if (properties.getModel().equals(IpProperties.LogModel.SIMPLE.getValue())){
            // 极简模式:不显示访问次数
            ipCountMap.forEach((k,v)->{
                log.info("ip:{}",k);
            });
        }



        if (properties.getCycleReset()){
            //如果需要清除数据
            ipCountMap.clear();
        }
    }
}
