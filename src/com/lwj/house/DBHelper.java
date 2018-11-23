package com.lwj.house;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHelper {
    public static void main(String[] args) {
        Connection conn;                                      //连接
        PreparedStatement pres;                                      //PreparedStatement对象
            try {
                Class.forName("com.mysql.jdbc.Driver");              //加载驱动
                System.out.println("数据库加载成功!!!");
                String url = "jdbc:mysql://localhost:3306/testdb";
                String user = "root";
                String password = "123";
                conn = DriverManager.getConnection(url, user, password); //建立连接
                System.out.println("数据库连接成功!!!");
            } catch (ClassNotFoundException | SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
 }