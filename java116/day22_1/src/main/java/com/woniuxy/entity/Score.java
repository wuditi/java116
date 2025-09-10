package com.woniuxy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Score {
    private Integer scid;
    private Integer cid;
    private Integer sid;
    private Integer grade;
    private Course course;
    private Student student;
}
