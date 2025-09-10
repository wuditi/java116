package com.woniuxy;

import java.sql.*;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        test();
        selectln();


    }

    private static void selectln() throws SQLException, ClassNotFoundException {
        String classname = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC";
        String user = "root";
        String password = "301268";
        //连接数据库
        Connection con = DriverManager.getConnection(url, user, password);
        Class.forName(classname);
        //sql语句
        String sql = "SELECT * FROM  t_course WHERE grade BETWEEN ? AND ? ";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, 70);
        st.setInt(2, 90);
        ResultSet resultset = st.executeQuery();
        while (resultset.next()) {

            System.out.println(resultset.getObject(1));
            System.out.println(resultset.getObject(2));
            System.out.println(resultset.getObject(3));
            System.out.println(resultset.getObject(4));
            System.out.println("--------");
        }
    }

    public static void test() throws SQLException {


        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db2?serverTimezone=UTC";
        String user = "root";
        String password = "301268";

        Connection connection = DriverManager.getConnection(url, user, password);

        Scanner sc = new Scanner(System.in);
        int eid = sc.nextInt();
        String empname = sc.next();
        int did = sc.nextInt();
        String sql = "INSERT INTO emp (eid,empname,did) VALUES (" + eid + ",'" + empname + "','" + did + "')";

        Statement stat = connection.createStatement();
        int flag = stat.executeUpdate(sql);
        System.out.println(flag);
        connection.close();
        stat.close();
    }


}
