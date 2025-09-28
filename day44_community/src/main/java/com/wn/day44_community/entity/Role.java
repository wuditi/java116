package com.wn.day44_community.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_role")
public class Role {
    @TableId(value = "rid",type = IdType.AUTO)
    private Integer rid;
    private String rname;
    private String remark;
    @TableField(exist = false)
    private List<Menu> menus;
}
