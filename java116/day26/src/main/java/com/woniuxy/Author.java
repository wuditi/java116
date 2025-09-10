package com.woniuxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Author {

    private String name;
    private int age;
    private String gender;
    private String address;
    List<Book> books;

}
