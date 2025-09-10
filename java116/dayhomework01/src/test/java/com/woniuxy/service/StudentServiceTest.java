package com.woniuxy.service;

import com.woniuxy.entity.Student;
import com.woniuxy.service.impl.SrudentServiceImpl;
import org.junit.Test;

public class StudentServiceTest {
    StudentService studentService = new SrudentServiceImpl();

    @Test
    public void testRegist() {
        try {
            Student student = new Student(1, "zxs", "zs", 11, "zxs@163.com");
            studentService.regist(student);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
