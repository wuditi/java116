package com.wn.day44_community.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_account")
public class Account {
    @TableId(value = "accid",type = IdType.AUTO)
    private Integer accid;
    private String aname;
    private String sex;
    private Double money;
}
