package com.woniuxy;

import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //方法一
        Student student = new Student();

        Class cla = student.getClass();

        //  Class clazz = Student.class;

        //Class cls = Class.forName("com.woniuxy.Student");

        Student stud = (Student) cla.newInstance();

        Field[] fields = cla.getFields();
        for (Field field : fields) {

            System.out.println(field);
        }
    }


}
