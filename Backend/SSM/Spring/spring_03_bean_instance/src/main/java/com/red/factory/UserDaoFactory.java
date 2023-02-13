package com.red.factory;

import com.red.dao.UserDao;
import com.red.dao.impl.UserDaoImpl;

/**
 * 该工厂获取对象需要实例化该工厂对象,称为实例化工厂
 */
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
