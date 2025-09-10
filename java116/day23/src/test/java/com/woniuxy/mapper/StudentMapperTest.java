package com.woniuxy.mapper;

import com.woniuxy.entity.Course;
import com.woniuxy.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentMapperTest {


    SqlSession sqlSession = MybatisUtil.createSqlSession();
    StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

    @Test
    public void testSelectBysid() {
        Student student = new Student();
        student.setSid(1);
        System.out.println(studentMapper.selectBysid(student));
    }

}
