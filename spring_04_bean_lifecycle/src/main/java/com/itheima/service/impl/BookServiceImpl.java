package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("set....");
    }

    public void save() {

        bookDao.save();
    }

    public void destroy() throws Exception {
        System.out.println("service destory");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
