package com.wn.day29.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @TableName t_menu
 */
@Data
public class TMenu {
    /**
     * 菜单id
     */
    private Integer mid;

    /**
     * 父级菜单id
     */
    private Integer pid;

    /**
     * 菜单名称
     */
    private String mname;

    /**
     * 显示的图标
     */
    private String icon;

    /**
     * vue跳转页面路由(url)
     */
    private String route;

    /**
     * 菜单的排列序号
     */
    private Integer sortid;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改时间
     */
    private Date updatetime;


    private List<TRole> roles;

}