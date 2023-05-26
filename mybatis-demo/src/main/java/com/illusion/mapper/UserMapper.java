package com.illusion.mapper;

import com.illusion.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();


    /*
        Mybatis 参数封装:
            * 单个参数
                1、pojo类型:直接使用，属性名和参数占位符名称一致
                2、Map集合：直接使用，键名和参数占位符名称一致
                3、Collection:封装为Map集合
                    map.put("arg0","collection集合")
                    map.put("collection","collection集合")
                4、List:封装为Map集合
                     map.put("arg0","List集合")
                     map.put("collection","List集合")
                     map.put("list","List集合")
                5、Array:封装为Map集合
                    map.put("arg0","数组")
                    map.put("array","数组")
                6、基本数据类型：直接使用
             * 多个参数:封装为Map集合,可以使用@param注解,替换Map集合中默认的arg键名
                 map.put("arg0",参数值1)
                 map.put("param1",参数值1)
                 map.put("arg1",参数值2)
                 map.put("param2",参数值2)

     */

    User select(@Param("username") String username,  String password);

    @Select("select * from tb_user where id = #{id}")
    User selectById(int id);
}
