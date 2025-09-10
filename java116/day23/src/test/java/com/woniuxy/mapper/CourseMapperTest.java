package com.woniuxy.mapper;

import com.woniuxy.entity.Course;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;

public class CourseMapperTest extends TestCase {

    SqlSession sqlSession = MybatisUtil.createSqlSession();
    CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);


    public void testSelectByCid() {
        Course course = new Course();
        course.setCid(1);
        System.out.println(courseMapper.selectByCid(course));
    }
}