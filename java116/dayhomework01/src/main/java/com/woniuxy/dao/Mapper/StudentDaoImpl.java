package com.woniuxy.dao.Mapper;

import com.woniuxy.dao.StudentDao;
import com.woniuxy.entity.Student;

import java.io.*;


public class StudentDaoImpl implements StudentDao {
    String path = "d:\\a.txt";
    Student student = new Student();

    //插入方法
    @Override
    public void insert(Student student) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));) {
            bw.write(student.getSid() + "-");
            bw.write(student.getSname() + "-");
            bw.write(student.getPassword() + "-");
            bw.write(student.getAge() + "-");
            bw.write(student.getEmail());
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    //name比较，进行查询
    @Override
    public Student distinctName(String sname) {


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] str = line.split("-");
                if (str[0].equals(sname)) {
                    //返回这组
                    return new Student(Integer.parseInt(str[0]),
                            str[1],
                            str[2],
                            Integer.parseInt(str[3]),
                            str[4]);
                }

            }
            return null;

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    //使用邮箱查询
    @Override
    public Student distinctEmail(String email) {

        StudentDao studentDao = new StudentDaoImpl();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] str = line.split("-");
                if (str[2].equals(email)) {
                    //返回这组
                    return new Student(Integer.parseInt(str[0]),
                            str[1],
                            str[2],
                            Integer.parseInt(str[3]),
                            str[4]);
                }
            }
            return null;

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    //登录

    @Override
    public Student loginPsaaword(String password) {
        StudentDao studentDao = new StudentDaoImpl();
        try {
            BufferedReader bw = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = bw.readLine()) != null) {
                String[] str = line.split("-");
                if (str[0].equals(password)) {
                    return new Student(Integer.parseInt(str[0]),
                            str[1],
                            str[2],
                            Integer.parseInt(str[3]),
                            str[4]);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

//    @Override
//    public Student logon(String password, String email){
//
//
//
//        return null;
//    }
//


}


