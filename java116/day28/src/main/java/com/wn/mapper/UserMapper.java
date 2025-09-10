package com.wn.mapper;

import com.wn.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("update t_mask set num =num-#{num} where price =#{price}")
    void UpdateUser(@Param("num") double num, @Param("price") double price);
}
