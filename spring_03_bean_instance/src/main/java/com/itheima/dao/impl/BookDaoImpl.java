package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {


    public BookDaoImpl() {
        System.out.println("没getbean也会生成吗？？//会 ");
    }

    public void save() {
        System.out.println("book dao save ...");
    }

}
