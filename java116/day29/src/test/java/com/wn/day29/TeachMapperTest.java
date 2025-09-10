package com.wn.day29;

import com.wn.day29.mapper.TeachMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeachMapperTest {
    @Autowired
    private TeachMapper teachMapper;


    @Test
    void selectByTid() {

        teachMapper.selectByTid().stream().forEach(System.out::println);

    }
}