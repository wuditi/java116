package com.wn.day29.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teach {

    private int tid;
    private String tname;
    private Integer tage;
    List<Stu> stuList;
}
