package com.wn.day35;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.wn.day35.entity.User;
import com.wn.day35.entity.UserDetail;
import com.wn.day35.mapper.UserDetailMapper;
import com.wn.day35.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;
import java.util.Set;

@SpringBootTest
public class UserMapperQuery {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDetailMapper userDetailMapper;

    @Test
    public void selectByWrapper() {
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq("uname", "王五").isNull("imgurl");

    }

    @Test
    public void selectBylambda() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
    }


    @Test
    void insertInfo() {
        //  User user = new User(null, "小李", "http://", "202cb962ac59075b964b07152d234b70", 1000.0,null);
        //userMapper.insert(user);
    }

    @Test
    void deleteCondition() {
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("uname", "王五").isNull("imgurl");
        userMapper.delete(wrapper);
    }

    @Test
    void addInfo() {
        User user = new User(null, "张", "http://", "202cb962ac59075b964b07152d234b70", 1000.00);
        userMapper.insert(user);
    }

    @Test
    void selectDetil() {
        User user = userMapper.selectById(1);
        if (user != null) {

            UserDetail userDetail = userDetailMapper.selectById(user.getUid());
            if (userDetail != null) {

                user.setUserdetail(userDetail);

            }
        }

        System.out.println(user);
    }
}
