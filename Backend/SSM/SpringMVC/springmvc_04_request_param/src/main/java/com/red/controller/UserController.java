package com.red.controller;


import com.red.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * GET:url地址传参
     * POST:表单传参
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,Integer age){
        System.out.println("普通参数传递 name ==>"+name);
        System.out.println("普通参数传递 age ==>"+age);
        return "{'status':'200'}";
    }

    /**
     * 使用@RequestParam注解处理名称不一样情况
     * @param username
     * @param age
     * @return
     */
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String username, Integer age){
        System.out.println("普通参数传递 username ==>"+username);
        System.out.println("普通参数传递 age ==>"+age);
        return "{'status':'200'}";
    }

    /**
     * 接收实体类参数
     * @param user
     * @return
     */
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println(user);
        return "{'status':'200'}";
    }

    /**
     * 接收实体类中包含实体类类型
     * @param user
     * @return
     */
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println(user);
        return "{'status':'200'}";
    }

    /**
     * 接收数组
     * @param like
     * @return
     */
    @RequestMapping("/likes")
    @ResponseBody
    public String likes(String[] like){
        System.out.println(Arrays.toString(like));
        return "{'status':'200'}";
    }

    /**
     * spring对引用类型的态度就是先创建一个对象然后再把数据set进去
     * 集合前面需要RequestParam注解 防止spring想创建List对象,让外面的参数作为数据
     * @param like
     * @return
     */
    @RequestMapping("/likesList")
    @ResponseBody
    public String likes(@RequestParam("like") List<String> like){
        System.out.println(like);
        return "{'status':'200'}";
    }

    /**
     * 接收json : 数组
     * @param likes
     * @return
     */
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println(likes);
        return "{'status':'200'}";
    }

    /**
     * 接收json : 对象
     * @param user
     * @return
     */
    @RequestMapping("/pojoParamForJSON")
    @ResponseBody
    public User pojoParamForJSON(@RequestBody User user){
        System.out.println(user);
        return user;
    }

    /**
     * 接收json : 对象数组
     * @param users
     * @return
     */
    @RequestMapping("/listPojoParamForJSON")
    @ResponseBody
    public List<User> listPojoParamForJSON(@RequestBody List<User> users){
        System.out.println(users);
        return users;
    }

    /**
     * 接收时间
     * @param date
     * @param date1
     * @param date2
     * @return
     */
    @RequestMapping("/dataParam")
    @ResponseBody
    public String dataParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date2
                            ){
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        return "{'status':'200'}";
    }

}
