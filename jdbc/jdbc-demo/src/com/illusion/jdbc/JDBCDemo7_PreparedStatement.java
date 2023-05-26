package com.illusion.jdbc;

import org.junit.Test;

import java.sql.*;

@SuppressWarnings("all")
public class JDBCDemo7_PreparedStatement {

    @Test
    public void testPreparedStatement() throws Exception {

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //接收用户输入用户名和密码
        String name = "zhangsan";
        String pwd = "123";

        //定义sql
        String sql = "select  * from tb_user where username = ? and password = ?";

        //获取pstmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置?的值
        pstmt.setString(1, name);
        pstmt.setString(2,pwd);

        //执行sql
        ResultSet rs = pstmt.executeQuery();

        //判断
        if(rs.next()){
            System.out.println("登陆成功");
        }else
            System.out.println("登录失败");


        //7、释放资源
        rs.close();
        conn.close();
        pstmt.close();
    }
    @Test//演示preparedStatement原理
    public void testPreparedStatement2() throws Exception {

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false&useServerPrepStmts=true";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        //接收用户输入用户名和密码
        String name = "zhangsan";
        String pwd = "123";

        //定义sql
        String sql = "select  * from tb_user where username = ? and password = ?";

        //获取pstmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置?的值
        pstmt.setString(1, name);
        pstmt.setString(2,pwd);

        //执行sql
        ResultSet rs = pstmt.executeQuery();

        //判断
        if(rs.next()){
            System.out.println("登陆成功");
        }else
            System.out.println("登录失败");


        //7、释放资源
        rs.close();
        conn.close();
        pstmt.close();
    }
}
