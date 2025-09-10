package com.woniuxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;


public class Test01 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        load();
        save();
    }

    //序列化，反序列化
    //保存
    public static void load() throws IOException, ClassNotFoundException {

        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("student.bin"));
        Student s1 = (Student) oos.readObject();
        System.out.println(s1);

    }

    public static void save() throws IOException {
        Student student = new Student(11, "asd", 12, 12, 3, "SDAD");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.bin"));
        oos.writeObject(student);
        oos.close();
    }
}
