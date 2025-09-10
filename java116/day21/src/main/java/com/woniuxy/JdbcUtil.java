package com.woniuxy;

import java.io.IOException;
import java.sql.*;

public class JdbcUtil {
    //连接
    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db2?serverTimezone=UTC";
        String user = "root";
        String password = "301268";

        Class.forName(className);

        return DriverManager.getConnection(url, user, password);

    }

    // 关闭
    public static void close(Connection conn, Statement stmt, ResultSet rs) throws SQLException, IOException {
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    //增删改都是用update.
    public static int update(Connection conections, String sql, Object... objects) throws SQLException, IOException {
        PreparedStatement ps = conections.prepareStatement(sql);
        for (int i = 0; i < objects.length; i++) {
            ps.setObject(i + 1, objects[i]);
        }
        int flag = ps.executeUpdate();
        close(conections, ps, null);
        return flag;
    }
    //查询封装
    //反射查询


}
