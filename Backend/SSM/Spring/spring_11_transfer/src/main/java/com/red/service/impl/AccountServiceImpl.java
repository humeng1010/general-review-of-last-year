package com.red.service.impl;

import com.red.mapper.AccountMapper;
import com.red.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void transfer(String out,String in,Double money) {
        accountMapper.outMoney(out,money);
//        int i = 1/0;
        accountMapper.inMoney(in,money);

    }
}
