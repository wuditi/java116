package com.wn.day29.entity;

import lombok.Data;

import java.util.List;

/**
 * @TableName t_role
 */
@Data
public class TRole {
    /**
     *
     */
    private Integer rid;

    /**
     *
     */
    private String rname;

    /**
     *
     */
    private String remark;


    private List<TMenu> tMenus;


    private List<Userinfo> userinfos;

}