package com.woniuxy.entity;

import lombok.Data;

import java.util.List;

/**
 * @TableName course
 */
@Data
public class Course {
    /**
     *
     */
    private Integer cid;

    /**
     *
     */
    private String cname;

    private List<Student> students;
}