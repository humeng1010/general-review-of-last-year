package com.red.factory;

import com.red.dao.OrderDao;
import com.red.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
