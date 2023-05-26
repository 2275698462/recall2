package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookDao {

//        @Insert("insert into tb_book values(null,#{type},#{name},#{description}))")
        @Insert("insert into tb_book (type,name,description) values(#{type},#{name},#{description})")
        void save(Book book);

        @Update("update tb_book set type = #{type},name =#{name},description = #{description} where id = #{id}")
        void update(Book book);

        @Delete("delete from tb_book where id = #{id}")
        void delete(Integer id);

        @Select("select * from tb_book where id = #{id}")
        Book getById(Integer id);

        @Select("select * from tb_book")
        List<Book> getAll();
}
