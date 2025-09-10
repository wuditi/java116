package com.woniuxy;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable {

    private String name;
    private int age;

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {

            return this.age - ((Student) o).age;

        }
        return 0;
    }
}
