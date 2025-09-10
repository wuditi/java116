package com.wn.day33.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {


    @Update("update users set imgurl=#{url} where uname=#{uname}")
    void updateUser(@Param("url") String url, @Param("uname") String uname);
}
