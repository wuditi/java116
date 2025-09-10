package com.wn.mapper;

import java.sql.*;

public class JdbcUntil {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        String className = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db2?serverTimezone=UTC";
        String user = "root";
        String password = "301268";
        Class.forName(className);
        Connection connection = DriverManager.getConnection(url, user, password);

        try {


            connection.setAutoCommit(false);

            String sql = "update t_mask set num =num-? where price =?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, 100);
            st.setInt(2, 5);
            st.executeUpdate();


            String sql2 = "update t_mask set num =num+? where price =?";
            PreparedStatement st2 = connection.prepareStatement(sql2);
            st2.setInt(1, 100);
            st2.setInt(2, 3);
            st2.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            connection.rollback();


        } finally {

            connection.close();
        }


    }


}
