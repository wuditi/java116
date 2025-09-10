package com.woniuxy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stu {
    private Integer sid;
    private String snane;
    private String gender;
    private Integer age;
    private String email;
}
