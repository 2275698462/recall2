package com.itheima.service;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    //新增
    boolean save(Book book);

    //修改
    boolean update(Book book);

    //删除
    boolean delete(Integer id);

    //根据id查询
    Book getById(Integer id);

    //查询所有
    List<Book> getAll();
}
