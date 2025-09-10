package com.woniuxy.mapper;

import com.woniuxy.entity.Course;
import com.woniuxy.entity.Student;

import java.util.List;

/**
 * @author 17600
 * @description 针对表【course】的数据库操作Mapper
 * @createDate 2025-08-14 17:40:46
 * @Entity com.woniuxy.entity.Course
 */
public interface CourseMapper {

    List<Student> selectByCid(Course course);
}




