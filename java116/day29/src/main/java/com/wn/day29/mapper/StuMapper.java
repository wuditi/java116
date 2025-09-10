package com.wn.day29.mapper;

import com.wn.day29.entity.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StuMapper {

    @Select("select * from student s inner join t_stu_tea ts on s.sid= ts.sid where tid =#{tid}")
    List<Stu> getStuList(Integer tid);


}
