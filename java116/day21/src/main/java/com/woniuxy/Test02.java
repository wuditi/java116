package com.woniuxy;

import java.lang.reflect.Field;

public class Test02 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.woniuxy.Student");
        //获取的是公有属性
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
            System.out.println(field.getName());
        }
        //所有的字段，共有私有
        Field[] fields1 = clazz.getDeclaredFields();
        for (Field field : fields1) {

            System.out.println(field);
            System.out.println(field.getName());
        }
        //反射添加字段
        Field fields2 = clazz.getField("grade");
        Student student = (Student) clazz.newInstance();
        fields2.set(student, 11);


    }

    private static void chuangjian() throws ClassNotFoundException {
        //Class对象,三种创建的方法
        Student student = new Student();
        Class clazz = student.getClass();

        Class clazz2 = Student.class;


        //forName方法
        Class clazz3 = Class.forName("com.woniuxy.Student");


        //反射获取属性
    }
}
