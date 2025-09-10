package com.wn.day29.mapper;

import com.wn.day29.entity.Teach;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeachMapper {


    @Select("select * from teacher")
    @Results({
            @Result(id = true, column = "tid", property = "tid"),
            @Result(column = "tname", property = "tname"),
            @Result(column = "tid", property = "stuList", many = @Many(select = "com.wn.day29.mapper.StuMapper.getStuList"))
    })
    List<Teach> selectByTid();


}
