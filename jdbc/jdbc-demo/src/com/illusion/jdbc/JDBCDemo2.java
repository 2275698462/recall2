package com.illusion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
@SuppressWarnings("all")
public class JDBCDemo2 {
    public static void main(String[] args) throws Exception {
        //1、注册驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //3、定义sql

        String sql1 = "update account set money = 3000 where id = 1";
        String sql2 = "update account set money = 3000 where id = 2";

        //4、获取执行sql的对象Statement
        Statement stmt = conn.createStatement();

        try {
            conn.setAutoCommit(false);//开启事务
            int count1 = stmt.executeUpdate(sql1);//执行sql,受影响的行数
            System.out.println(count1);//处理结果
            int count2 = stmt.executeUpdate(sql2);
            System.out.println(count2);
            //提交事务
            conn.commit();
        } catch (Exception throwables) {
            throwables.printStackTrace();//回滚事务
        }


        //7、释放资源
        stmt.close();
        conn.close();
    }
}
