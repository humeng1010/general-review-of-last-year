package com.red.dao.impl;

import com.red.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private int connectionNumber;
    private String databaseName;

    public UserDaoImpl() {
    }

    public UserDaoImpl(int connectionNumber, String databaseName) {
        this.connectionNumber = connectionNumber;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("user dao save..."+databaseName+","+connectionNumber);
    }
}
