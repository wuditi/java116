package com.wn.day29;

import com.wn.day29.entity.Emp;
import com.wn.day29.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmpMapperTest {
    @Autowired
    private EmpMapper emp;

    @Test
    void selectAllTest() {

        emp.selectAll().forEach(System.out::println);

    }

    @Test
    void selectByConditionTest() {
        Emp e = new Emp();
        e.setJob("经");
        emp.selectByCondition(e);
    }
}