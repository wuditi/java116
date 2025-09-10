package com.wn.boot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    private int sid;
    private String sname;
    private int age;
    private String gender;
    private String email;

}
