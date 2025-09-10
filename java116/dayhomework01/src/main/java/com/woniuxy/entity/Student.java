package com.woniuxy.entity;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer sid;
    private String Sname;
    private String password;
    private Integer age;
    private String email;

}
