package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import com.itheima.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private IBookService iBookService;

    @Test
    void testGetById(){
        Book byId = iBookService.getById(1);
        System.out.println(byId);
    }

    @Test
    void testGetPage(){
        IPage<Book> page = iBookService.page(new Page<Book>(2, 5));
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
    }
}
