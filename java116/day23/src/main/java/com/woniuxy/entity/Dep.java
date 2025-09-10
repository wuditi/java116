package com.woniuxy.entity;

import lombok.Data;

import java.util.List;

/**
 * @TableName dep
 */
@Data
public class Dep {
    /**
     *
     */
    private Integer did;

    /**
     *
     */
    private String depname;


    private List<Emp> emps;
}