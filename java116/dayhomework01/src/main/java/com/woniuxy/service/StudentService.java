package com.woniuxy.service;

import com.woniuxy.entity.Student;

public interface StudentService {
    void regist(Student student);

    Student login(String sname, String password);
}
