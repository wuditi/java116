package com.woniuxy.ui;

import com.woniuxy.dao.StudentDao;
import com.woniuxy.dao.Mapper.StudentDaoImpl;
import com.woniuxy.entity.Student;
import com.woniuxy.service.impl.SrudentServiceImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ShowMenu {

    static StudentDao studentDao = new StudentDaoImpl();

    public static void showStartMenu() {
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.退出");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("开始登录");
                showMainenu();
                break;
            case 2:
                System.out.println("开始注册");

                Student dao = new Student(12, "zs", "zs", 11, "zs@163.com");
                studentDao.insert(dao);
                break;
            case 3:
                System.out.println("退出");
                System.exit(0);
                break;
            default:
                showStartMenu();
                break;
        }
    }

    public static void showMainenu() {
        String email = null;
        String password = null;
        Scanner scanner = new Scanner(System.in);
        email = scanner.next();
        password = scanner.next();
        SrudentServiceImpl srudentService = new SrudentServiceImpl();
        Student student = new Student();
        student = srudentService.login(email, password);
        if (student != null) {
            System.out.println("进入主菜单");
        }
        System.out.println("1.查询所有学生");
        System.out.println("2.根据姓名查询");
        System.out.println("3.添加学生");
        System.out.println("4.修改学生");
        System.out.println("5.删除学生");
        System.out.println("6.返回上级菜单");
        Scanner sc = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("查询所有学生");
                findStudent();
                break;
            case 2:
                System.out.println("根据姓名查询");
                break;
            case 3:
                System.out.println("添加学生");
                break;
            case 4:
                System.out.println("修改学生");
                break;
            case 5:
                System.out.println("删除学生");
                break;
            case 6:
                System.out.println("返回上级菜单");
                showStartMenu();
                break;
        }
    }

    public static void findStudent() {
        String path = "d:\\a.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] str = line.split("-");

                System.out.println(new Student(Integer.parseInt(str[0]),
                        str[1],
                        str[2],
                        Integer.parseInt(str[3]),
                        str[4]));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
