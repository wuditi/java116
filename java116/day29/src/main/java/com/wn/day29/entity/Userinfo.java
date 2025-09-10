package com.wn.day29.entity;

import lombok.Data;

import java.util.List;

/**
 * @TableName userinfo
 */
@Data
public class Userinfo {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 权限类型
     */
    private Integer type;

    /**
     * 备注
     */
    private String remarks;

    /**
     *
     */
    private String imgPath;

    /**
     * 是否删除
     */
    private Integer isdelete;


    private List<TRole> tRoles;

}