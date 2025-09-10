package com.woniuxy.dao;

import com.woniuxy.entity.Student;

import java.io.IOException;

public interface StudentDao {

    void insert(Student student);

    Student distinctName(String sname);

    Student distinctEmail(String email);

    Student loginPsaaword(String password);

    // Student loginon (String email, String password);

}
