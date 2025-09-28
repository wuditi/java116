package com.wn.day41.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dept {

    private Integer did;
    private String deptName;
    private String deptDesc;
}
