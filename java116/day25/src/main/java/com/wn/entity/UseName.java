package com.wn.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UseName {

    private int id;
    private String name;
    private int age;
    private String gender;
    private Date birthday;
    private Dog dog;
    private int[] NUM;
    private List<Dog> dogs;
    private Map<String, String> aaa;
    //private Properties
}
