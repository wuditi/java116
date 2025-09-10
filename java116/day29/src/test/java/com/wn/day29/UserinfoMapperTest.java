package com.wn.day29;

import com.wn.day29.mapper.UserinfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserinfoMapperTest {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Test
    void selectUserinfoById() {

        userinfoMapper.selectUserinfoById(27).stream().forEach(System.out::println);
    }
}