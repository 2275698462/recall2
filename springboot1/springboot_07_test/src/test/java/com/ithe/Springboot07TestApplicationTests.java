package com.ithe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.itheima.service.BookService;

@SpringBootTest
class Springboot07TestApplicationTests {

	@Autowired
	private BookService bookService;

	@Test
	public void sava() {
		bookService.save();
	}

}
