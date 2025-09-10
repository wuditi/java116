package com.woniuxy.dao.Mapper;

import com.woniuxy.entity.Course;
import com.woniuxy.entity.Score;
import com.woniuxy.entity.Student;

import java.util.List;

public interface StudentMapper {

    List<Course> selectBySid(Student student);

}
