package com.illusion.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.illusion.pojo.Brand;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 品牌数据的增删改查
 */
@SuppressWarnings("all")
public class BrandTest {
    @Test
    /**
     * 查询所有
     * 1、SQL:select * from tb_brand
     * 2、参数:不需要
     * 3、结果：List<Brand>
     */
    public void testSelectAll() throws Exception{
        //1、获取Connection
        //3、加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //4、获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //5、获取数据库连接Connection
        Connection conn = dataSource.getConnection();

        String sql = "select * from tb_brand";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        Brand brand = null;
        List<Brand> brands = new ArrayList<Brand>();
        while (rs.next()){
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            //封装Brand对象
            brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);

            //装载集合
            brands.add(brand);
        }
        System.out.println(brands);
    }

    /**
     * 添加
     * 1、SQL:insert into tb_brand(brand_name,company_name,ordered,desciption,status) values (?,?,?,?,?);
     * 2、参数:需要,除了id之外的所有参数信息
     * 3、结果：boolean
     */
    @Test
    public void testAdd() throws Exception{
        //接收页面提交的参数
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1;
        String description = "绕地球一圈";
        int status = 1;

        //1、获取Connection
        //3、加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //4、获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //5、获取数据库连接Connection
        Connection conn = dataSource.getConnection();

        String sql = "insert into tb_brand(brand_name,company_name,ordered,description,status) values (?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置参数
        pstmt.setString(1, brandName);
        pstmt.setString(2, companyName);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);

        //执行sql
        int count = pstmt.executeUpdate();//受影响的行数

        //处理结果
        System.out.println(count > 0);


        //释放资源
        pstmt.close();
        conn.close();
    }
    /**
     * 修改
     * 1、SQL:update tb_brand set brand_name = ?,company_name = ?,ordered = ?,desciption = ?,status = ? where id = ?
     * 2、参数:需要所有数据
     * 3、结果：boolean
     */
    @Test
    public void testUpdate() throws Exception{
        //接收页面提交的参数
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1000;
        String description = "绕地球100圈";
        int status = 1;
        int id = 13;

        //1、获取Connection
        //3、加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //4、获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //5、获取数据库连接Connection
        Connection conn = dataSource.getConnection();

        String sql = "update tb_brand set brand_name = ?,company_name = ?,ordered = ?,description = ?,status = ? where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置参数
        pstmt.setString(1, brandName);
        pstmt.setString(2, companyName);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);
        pstmt.setInt(6, id);

        //执行sql
        int count = pstmt.executeUpdate();//受影响的行数

        //处理结果
        System.out.println(count > 0);


        //释放资源
        pstmt.close();
        conn.close();
    }

    /**
     * 删除
     * 1、SQL:delete from tb_brand where id = ?
     * 2、参数:需要所有数据
     * 3、结果：boolean
     */
    @Test
    public void testDelete() throws Exception{

        int id = 13;

        //1、获取Connection
        //3、加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //4、获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //5、获取数据库连接Connection
        Connection conn = dataSource.getConnection();

        String sql = "delete from tb_brand where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置参数
        pstmt.setInt(1, id);

        //执行sql
        int count = pstmt.executeUpdate();//受影响的行数

        //处理结果
        System.out.println(count > 0);


        //释放资源
        pstmt.close();
        conn.close();
    }

}
