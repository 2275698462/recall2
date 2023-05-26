package com.illusion.mapper;

import com.illusion.pojo.Brand;
import com.illusion.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    //查询所有
     List<Brand> selectAll();

     Brand selectById(int id);

    //散装参数:需要使用@Param("SQL参数占位符名称")
    //List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    //对象参数:对象的属性名称要和参数占位符名称一致
    //List<Brand> selectByCondition(Brand brand);

    //map集合参数:
    List<Brand> selectByCondition(Map map);

    //单条件动态查询
    List<Brand> selectByConditionSingle(Brand brand);

    //添加
    void add(Brand brand);

    //修改
    int update(Brand brand);

    //删除
    void deleteById(int id);

    //批量删除
    void deleteByIds(@Param("ids") int[] ids);



}
