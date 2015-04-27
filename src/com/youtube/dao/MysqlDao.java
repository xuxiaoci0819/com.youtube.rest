package com.youtube.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by xxc on 2015/4/24.
 */
public class MysqlDao {
    private static Connection conn = null;

    public static Connection getConnection() throws Exception {
        if(conn != null){
            return conn;
        }

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/forum","root","diabloii");
        return conn;
    }
}
