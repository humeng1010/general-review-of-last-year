package com.red.dao.impl;

import com.red.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    public OrderDaoImpl() {
        System.out.println("order dao init...");
    }

    @Override
    public void save() {
        System.out.println("order dao save...");
    }
}
