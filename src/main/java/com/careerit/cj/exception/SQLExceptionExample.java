package com.careerit.cj.exception;

import java.sql.*;

public class SQLExceptionExample {

        public static void main(String[] args) {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "root";
            String password = "password";
            try(Connection con = DriverManager.getConnection(url, username, password)){
                String query = "select * from employee";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    System.out.println(rs.getString("Column_name"));
                }
            } catch (SQLException e) {
                System.out.println("Problem while accessing array element " + e.getMessage());
            }
        }
}
