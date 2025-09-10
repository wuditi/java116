package com.wn.boot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private int uid;
    private String uname;
    private String pwd;
    private String imgurl;
    private double money;

}
