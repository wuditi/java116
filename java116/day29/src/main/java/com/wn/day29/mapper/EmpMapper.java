package com.wn.day29.mapper;

import com.wn.day29.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    @Select("select * from emp")
    List<Emp> selectAll();

    @Select("<script>select * from emp " +
            "<where>"
            + "<if test=\"ename!=null and snane!=''\">"
            + "and ename like '%'#{ename}'%'"
            + "</if>"
            + "<if test=\"job!=null and job!=''\">"
            + "and job like '%'#{job}'%'"
            + "</if>"
            + "<if test=\"hiredate!=null and hiredate!=''\">"
            + "and hiredate =#{date}"
            + "</if>"
            + "<if test=\"sal!=null and sal!=''\">"
            + "and sal = #{sal}"
            + "</if>"
            + "</where>"
            + "</script>"
    )
    List<Emp> selectByCondition(Emp emp);

}
