package com.woniuxy.entity;

import lombok.Data;

/**
 * @TableName emp
 */
@Data
public class Emp {
    /**
     *
     */
    private Integer eid;

    /**
     *
     */
    private String empname;

    /**
     *
     */
    //private Integer did;


    private Dep dep;
}