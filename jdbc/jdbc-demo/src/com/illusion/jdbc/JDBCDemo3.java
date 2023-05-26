package com.illusion.jdbc;

import org.junit.Test;

import javax.net.ssl.SSLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
@SuppressWarnings("all")
public class JDBCDemo3 {
    @Test
    public void testDmL() throws Exception {
        //1、注册驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //2获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //3、定义sql

        String sql = "drop table job";

        //4、获取执行sql的对象Statement
        Statement stmt = conn.createStatement();

        //5、执行sql
        int count = stmt.executeUpdate(sql);

        //6、处理结果
        System.out.println("SS" + count);

        //7、释放资源
        stmt.close();
        conn.close();
    }
}
