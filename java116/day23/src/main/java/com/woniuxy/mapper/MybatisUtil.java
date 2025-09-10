package com.woniuxy.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {

    public static SqlSessionFactory sqlSessionFactory;


    public static SqlSession createSqlSession() {

        try {
            if (sqlSessionFactory == null) {
                String recourse = "mybatis-config.xml";
                InputStream inputStream = Resources.getResourceAsStream(recourse);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
            return sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

}
