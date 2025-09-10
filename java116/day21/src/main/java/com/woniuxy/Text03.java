package com.woniuxy;

import java.sql.*;

import static java.util.Collections.list;


public class Text03 {


    private static void selectl() throws SQLException, ClassNotFoundException {
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
}
