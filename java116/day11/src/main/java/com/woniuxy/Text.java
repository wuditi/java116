package com.woniuxy;

import lombok.ToString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Text {
    public static void main(String[] args) {

        Student[] student = new Student[3];
        student[0] = new Student("zs", 11);
        student[1] = new Student("ls", 13);
        student[2] = new Student("ln", 12);
        //升序
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));

        //降序
        Arrays.sort(student, new StudentDesc());
        System.out.println(Arrays.toString(student));

        //名字升序
        Arrays.sort(student, new StudentNameAsc());
        System.out.println(Arrays.toString(student));


        //名字降序

        Arrays.sort(student, new StudentNameDesc());
        System.out.println(Arrays.toString(student));

    }

}
