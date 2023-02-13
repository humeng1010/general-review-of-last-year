package com.red;

import com.red.dao.BookDao;
import com.red.dao.OrderDao;
import com.red.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        获取通过无参构造函数创建bean
        BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);
        bookDao.save();
//        获取通过静态工厂创建bean
        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        orderDao.save();
//        获取通过实例工厂创建的bean
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        userDao.save();


    }
}
