package com.wn.day35.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@TableName("Users")
public class User {

    /**
     * type = IdType.INPUT  自行输入
     * type = IdType.AUTO  自增
     * type = IdType.ASSIGN_ID 雪花id
     */
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;
    private String uname;
    private String imgurl;
    private String pwd;
    private double money;

    private Integer deleted;

    @TableField(fill = FieldFill.INSERT)
    private Date addtime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatetime;

    @TableField(exist = false)
    private UserDetail userdetail;

    public User(Integer uid, String uname, String imgurl, String pwd, double money) {
        this.uid = uid;
        this.uname = uname;
        this.imgurl = imgurl;
        this.pwd = pwd;
        this.money = money;
    }
}
