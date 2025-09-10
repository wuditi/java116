package com.woniuxy.dao.Mapper;

import com.woniuxy.entity.Stu;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StuMapperImplTest extends TestCase {


    SqlSession sqlSession = MybatisUtil.createSqlSession();
    StuMapper stuMapper = sqlSession.getMapper(StuMapper.class);

    @Test
    public void testInsert() {

        Stu stu = new Stu(5, "ss", "男", 11, "sasas");
        stuMapper.insert(stu);
    }

    @Test
    public void testUpdate() {
        //StuMapper mapper = new StuMapperImpl();
        //mapper.update(new Stu(5, "mm", "女", 22, "33"));
    }

    @Test
    public void testSelectBysid() {


        System.out.println(stuMapper.selectBysid(2));

    }

    @Test
    public void testselectByCondition01() {

        Stu stu = new Stu();
        stu.setGender("男");
        stu.setAge(11);
        System.out.println(stuMapper.selectByCondition01(stu));
    }

    @Test
    public void testinsertBatch() {

        List<Stu> list = new ArrayList<Stu>();
        list.add(new Stu(6, "ss", "男", 11, "sasas"));
        list.add(new Stu(7, "ss", "男", 11, "sasa"));
        list.add(new Stu(8, "ss", "男", 11, "sa"));
        stuMapper.insertBatch(list);
    }

    @Test
    public void testSelectConditionPageCount() {
        Stu stu = new Stu();
        stu.setGender("男");
        stu.setAge(11);
        System.out.println(stuMapper.selectConditionPageCount(stu));
    }

    @Test
    public void testselectConditionPage() {
        int pageIndex = 1;
        int pageSize = 2;
        Stu stu = new Stu();
//        stu.setGender("男");
//        stu.setAge(11);
        System.out.println(stuMapper.selectConditionPage(stu, pageIndex, pageSize));
    }


}








