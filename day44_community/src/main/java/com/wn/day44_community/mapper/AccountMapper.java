package com.wn.day44_community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wn.day44_community.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
