package com.wn.day37community.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("building")
public class Building {
    @TableId
    private Integer id;
    private String numbers;
    private String units;
    private String remarks;
}
