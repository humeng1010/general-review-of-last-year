package com.red.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.red.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    void updateAgeById(@Param("age")Integer age,@Param("id")Long id);
}
