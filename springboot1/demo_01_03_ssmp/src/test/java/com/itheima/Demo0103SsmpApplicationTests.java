package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo0103SsmpApplicationTests {

	@Autowired
	private BookDao bookDao;

	@Test
	void contextLoads() {
		Book book = new Book();
		book.setType("测试数据111");
		book.setName("测试数据111");
		book.setDescription("测试数据111");
		bookDao.insert(book);
	}

	@Test
	void testGetPage(){
		IPage page = new Page(2, 5);
		bookDao.selectPage(page, null);
		System.out.println(page.getCurrent());//当前页
	}

	@Test
	void testGetBy(){
		QueryWrapper<Book> qw = new QueryWrapper<>();
		qw.like("name", "spring");
		bookDao.selectList(qw);
	}
}
