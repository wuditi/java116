package com.woniuxy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Text01 {
    public static void main(String[] args) throws IOException {

        List<Students> student = new ArrayList<Students>();
        student.add(new Students(1, "AW", 22));
        student.add(new Students(2, "ZS", 123));
        student.add(new Students(3, "DD", 334));
        BufferedWriter wr = new BufferedWriter(new FileWriter("a.txt"));

        for (Students students : student) {
            wr.write(students.getId() + "-" + students.getName() + "-" + students.getAge() + "\n");
            wr.flush();
        }
        wr.close();
    }

    public static List<Students> load() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("a.txt"));

        return null;
    }
}
