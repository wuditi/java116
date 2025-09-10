package com.wn.day29.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stu {


    private Integer sid;

    private String sname;

    private Integer sage;

    private List<Teach> teachList;
}
