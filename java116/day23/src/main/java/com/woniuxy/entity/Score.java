package com.woniuxy.entity;

import lombok.Data;

/**
 * @TableName score
 */
@Data
public class Score {
    /**
     *
     */
    private Integer scid;

    /**
     *
     */
    private Integer cid;

    /**
     *
     */
    private Integer sid;

    /**
     *
     */
    private Integer grade;


    private Course course;


    private Student student;


}