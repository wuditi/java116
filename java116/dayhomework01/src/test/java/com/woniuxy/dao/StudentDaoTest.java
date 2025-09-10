package com.woniuxy.dao;

import com.woniuxy.dao.Mapper.StudentDaoImpl;
import com.woniuxy.entity.Student;
import org.junit.Test;

public class StudentDaoTest {


    StudentDao studentDaoTest = new StudentDaoImpl();

    @Test
    public void testInsert() {
        Student dao = new Student(12, "zs", "zs", 11, "zs@163.com");
        studentDaoTest.insert(dao);
    }

}
