package com.wn.day35.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wn.day35.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
