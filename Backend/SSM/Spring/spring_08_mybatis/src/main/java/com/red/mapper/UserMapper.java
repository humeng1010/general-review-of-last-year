package com.red.mapper;

import com.red.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
//    @ResultMap("userResultMap")//使用xml文件中定义的resultMap
    @Results(id = "userResultMap",value = {
            @Result(column = "user_birth",property = "userBirth")
    })
    @Select("select * from t_user;")
    List<User> getAll();
}
