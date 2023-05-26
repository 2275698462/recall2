package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

//    @GetMapping
//    public String getById(){
//        System.out.println("get is ...");
//        return "springboot";
//    }

    @GetMapping
    public Book getById(){
        System.out.println("get is ...");
        Book book = new Book();
        book.setId(1);
        book.setName("666");
        book.setType("777");
        book.setDescription("999");
        return book;
    }
}
