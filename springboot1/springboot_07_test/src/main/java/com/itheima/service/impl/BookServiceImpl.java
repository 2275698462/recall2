package com.itheima.service.impl;

import org.springframework.stereotype.Service;
import com.itheima.service.BookService;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("hello test");
    }
}
