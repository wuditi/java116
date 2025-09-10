package com.woniuxy.service.impl;

import com.woniuxy.dao.StudentDao;
import com.woniuxy.dao.Mapper.StudentDaoImpl;
import com.woniuxy.entity.Student;
import com.woniuxy.service.StudentService;

public class SrudentServiceImpl implements StudentService {
    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public void regist(Student student) {
        Student findName = studentDao.distinctName(student.getSname());
        if (findName == null) {
            throw new RuntimeException("用户名重复");
        }
        Student findEmail = studentDao.distinctName(student.getEmail());
        if (findName == null) {
            throw new RuntimeException("邮箱重复");
        }
        studentDao.insert(student);
    }

    @Override
    public Student login(String email, String password) {
        Student student = studentDao.distinctEmail(email);
        if (student == null) {

            System.out.println("用户名不存在");
            return null;
        }
        if (student.getPassword() == null) {

            System.out.println("用户名或密码错误");
            return null;
        }

        return student;

    }


}