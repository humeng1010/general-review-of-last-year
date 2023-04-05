package com.module.mapper;

import com.module.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from module.tb_user where account = #{account} ;")
    User selectByAccount(@Param("account") String account);


    @Insert("insert into module.tb_user (account, password) values (#{user.account},#{user.password});")
    void saveUser(@Param("user") User user);
}
