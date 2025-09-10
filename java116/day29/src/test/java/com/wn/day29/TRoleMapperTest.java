package com.wn.day29;

import com.wn.day29.mapper.TRoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TRoleMapperTest {

    @Autowired
    private TRoleMapper mapper;

    @Test
    void selectAll() {
        mapper.selectAll().stream().forEach(System.out::println);
    }
}