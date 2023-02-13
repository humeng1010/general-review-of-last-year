package com.red.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    /**
     * 事务管理员负责协调所有对数据库的操作，并确保事务的原子性。默认情况下，在该事务中的所有数据库操作都是由事务协调员管理的，要么同时成功，要么同时失败。
     * 但是，如果方法上配置了@Transactional(propagation = Propagation.REQUIRES_NEW)注解，则该事务协调员将不再加入事务管理员的管理，而是自己成为事务管理员，拥有自己的事务协调。这意味着该方法中的数据库操作将不会受到外部事务的影响，并且可以独立回滚。
     * @param out
     * @param in
     * @param money
     */
    @Transactional
    //属于事务管理员,该事务下的所有对数据库的操作都属于事务协调员,事务协调员默认会加入事务管理员的管理,要么同时成功要么同时失败.当内部的操作数据库的方法的接口上配置了@Transactional(propagation = Propagation.REQUIRES_NEW),则该事务协调员不会加入事务管理员而是自己是事务管理员
    void transfer(String out,String in, Double money);
}
