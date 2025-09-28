package com.wn.day44_community.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wn.day44_community.entity.Account;
import com.wn.day44_community.entity.Dweller;
import com.wn.day44_community.entity.House;
import com.wn.day44_community.mapper.AccountMapper;
import com.wn.day44_community.service.AccountService;
import com.wn.day44_community.utils.PageResult;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public PageResult<Account> selectAll(@RequestParam Integer pageNum, @RequestParam Integer pageSize, Account account) {

        //条件封装
        LambdaQueryWrapper<Account> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(account.getAname() != null && !account.getAname().trim().isEmpty(), Account::getAname, account.getAname())
                .eq(account.getSex() != null && !account.getSex().trim().isEmpty(), Account::getSex, account.getSex())
                .ge(account.getMoney() != null, Account::getMoney, account.getMoney());

        //分页

        Page<Account> page = new Page<>(pageNum, pageSize);

        List<Account> accounts = accountMapper.selectList(page,queryWrapper);

        if (accounts != null && !(accounts.isEmpty())) {



            PageResult<Account> result = new PageResult<>(page.getCurrent(), page.getSize(), page.getTotal(),accounts);
            return result;
        }
        return null;
    }
}
