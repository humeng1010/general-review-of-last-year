package com.module.service;

import com.module.entity.User;
import com.module.utils.Result;

public interface UserService {
    Result login(User user);

    Result code(User user);
}
