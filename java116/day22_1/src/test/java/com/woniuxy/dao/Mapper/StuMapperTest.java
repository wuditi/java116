package com.woniuxy.dao.Mapper;

import com.woniuxy.entity.Dep;
import com.woniuxy.entity.Emp;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;

public class StuMapperTest extends TestCase {
    SqlSession sqlSession = MybatisUtil.createSqlSession();
    StuMapper stuMapper = sqlSession.getMapper(StuMapper.class);

    public void testSelectBydid() {
        Emp emp = new Emp();
        emp.setEid(1);
        System.out.println(stuMapper.selectByEid(emp));

    }

    public void testTestSelectBydid() {
        Emp emp = new Emp();
        emp.setEid(1);
        System.out.println(stuMapper.selectByEid(emp));
    }

    public void testSelectByDid() {
        Dep dep = new Dep();
        dep.setDid(1);
        System.out.println(stuMapper.selectByDid(dep));
    }
}