package com.wn.day44_community.controller;

import com.alibaba.druid.sql.dialect.blink.parser.BlinkStatementParser;
import com.wn.day44_community.entity.Account;
import com.wn.day44_community.entity.Dweller;
import com.wn.day44_community.service.AccountService;
import com.wn.day44_community.utils.PageResult;
import com.wn.day44_community.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Account")
@CrossOrigin
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("findAll")
    public ResultObj findAll(){

       List<Account>list= accountService.list();
        return ResultObj.Ok(list);
    }
    @GetMapping("queryAccountAll")
    public ResultObj queryAccountAll(Integer pageNum, Integer pageSize, Account at) {

        PageResult<Account> account = accountService.selectAll(pageNum, pageSize, at);

        return ResultObj.Ok(account);
    }

}
