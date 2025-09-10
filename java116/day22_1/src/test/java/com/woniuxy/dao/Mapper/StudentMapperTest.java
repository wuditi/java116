package com.woniuxy.dao.Mapper;

import com.woniuxy.entity.Student;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;

public class StudentMapperTest extends TestCase {
    SqlSession sqlSession = MybatisUtil.createSqlSession();
    StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

    public void testSelectBySid() {
        Student student = new Student();
        student.setSid(1);
        System.out.println(studentMapper.selectBySid(student));
    }
}