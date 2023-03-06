package com.red.service;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class IpCountService {
    private final Map<String,Integer> ipCountMap = new HashMap<>();

    @Autowired
    //当前的request对象的注入工作由使用当前starter的工厂提供自动装配
    private HttpServletRequest httpServletRequest;
    public void count(){
        // 每次调用这个方法就记录当前访问的ip,然后累加访问次数
//        1.获取当前操作的ip地址
        String ip = httpServletRequest.getRemoteAddr();

        System.out.println("========="+ip);
//        2.根据当前的ip地址从map中取值,然后递增
        Integer count = ipCountMap.get(ip);
        if (count == null){
            ipCountMap.put(ip,1);
        }else {
            ipCountMap.put(ip,count + 1);
        }

    }
}
