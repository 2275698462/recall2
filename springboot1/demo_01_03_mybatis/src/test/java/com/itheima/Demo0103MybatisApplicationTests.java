package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootTest
class Demo0103MybatisApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void contextLoads() {
		//List<User> users = userDao.selectAll();
		System.out.println(userDao.selectAll());
	}

}
