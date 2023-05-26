package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo0103MybatisplusApplicationTests {

	@Autowired
	private UserDao userDao;


	@Test
	void test() {
		User user = userDao.selectById(1);
		System.out.println(user);
	}

}
