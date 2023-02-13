package com.red.dao.impl;

import com.red.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("user dao init...");
    }

    @Override
    public void save() {
        System.out.println("user dao save...");
    }
}
