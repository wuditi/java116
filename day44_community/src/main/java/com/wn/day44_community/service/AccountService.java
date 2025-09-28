package com.wn.day44_community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wn.day44_community.entity.Account;
import com.wn.day44_community.entity.Dweller;
import com.wn.day44_community.utils.PageResult;

public interface AccountService extends IService<Account> {

    PageResult<Account> selectAll(Integer pageNum, Integer pageSize, Account account);
}
