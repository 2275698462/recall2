package com.illusion.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
@SuppressWarnings("all")
public class JDBCDemo6_UserLogin {
    @Test
    public void testLogin() throws Exception {

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //接收用户输入 用户名和密码
        String name = "zhangsan";
        String pwd = "123";

        String sql = "select * from tb_user where username = '"+name+"' and password = '"+pwd+"'";

        //获取stmt对象
        Statement stmt = conn.createStatement();

        //执行sql
        ResultSet rs = stmt.executeQuery(sql);

        //判断
        if(rs.next()){
            System.out.println("登陆成功");
        }else
            System.out.println("登录失败");


        //7、释放资源
        rs.close();
        conn.close();
        stmt.close();
    }

    @Test
    public void testLogin_Inject() throws Exception {

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //接收用户输入 用户名和密码
        String name = "asdsdasdawq";
        String pwd = "' or '1' = '1";

        String sql = "select * from tb_user where username = '"+name+"' and password = '"+pwd+"'";
        System.out.println("sql = " + sql);
        //获取stmt对象
        Statement stmt = conn.createStatement();

        //执行sql
        ResultSet rs = stmt.executeQuery(sql);

        //判断
        if(rs.next()){
            System.out.println("登陆成功");
        }else
            System.out.println("登录失败");


        //7、释放资源
        rs.close();
        conn.close();
        stmt.close();
    }
}
