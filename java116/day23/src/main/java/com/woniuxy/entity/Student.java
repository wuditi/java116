package com.woniuxy.entity;

import lombok.Data;

import java.util.List;

/**
 * @TableName student
 */
@Data
public class Student {
    /**
     *
     */
    private Integer sid;
    /**
     *
     */
    private String sname;


    private List<Course> courses;

}