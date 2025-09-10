package com.wn.boot.mappper;

import com.wn.boot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from users where uname=#{uname} and pwd=#{password}")
    User selectByUidAndUname(@Param("uname") String uname, @Param("password") String password);

    @Select("select * from users ")
    List<User> selectAll();
}
