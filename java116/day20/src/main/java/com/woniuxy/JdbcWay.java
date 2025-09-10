package com.woniuxy;


import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcWay {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db2?serverTimezone=UTC";
        String user = "root";
        String password = "301268";

        Class.forName(className);

        return DriverManager.getConnection(url, user, password);


    }

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

    public static int updat(Connection conections, String sql, Object... objects) throws SQLException, IOException {
        PreparedStatement ps = conections.prepareStatement(sql);
        for (int i = 0; i < objects.length; i++) {
            ps.setObject(i + 1, objects[i]);
        }
        int flag = ps.executeUpdate();
        close(conections, ps, null);
        return flag;
    }

}
