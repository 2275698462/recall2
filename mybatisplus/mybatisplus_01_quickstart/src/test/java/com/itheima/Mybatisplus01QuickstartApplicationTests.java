package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

	@Autowired
	private UserDao userDao;


	@Test
	void testGetAll() {
		//方式一：按条件查询
//		QueryWrapper qw = new QueryWrapper();
//		qw.lt("age", 18);
//		List<User> users = userDao.selectList(qw);
//		System.out.println(users);

		//方式二：lambda格式按条件查询
//		QueryWrapper<User> qw = new QueryWrapper<User>();
//		qw.lambda().lt(User::getAge, 18);
//		List<User> users = userDao.selectList(qw);
//		System.out.println(users);

		//方式三：lambda格式按条件查询
//		LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//		lqw.lt(User::getAge, 18);
//		List<User> users = userDao.selectList(lqw);
//		System.out.println(users);

		//模拟页面传递过来的查询数据
		UserQuery uq = new UserQuery();
//		uq.setAge(10);
		uq.setAge2(30);

		//null判断
//		LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//		lqw.lt(null != uq.getAge2(), User::getAge, uq.getAge2());
//		lqw.gt(null != uq.getAge(), User::getAge, uq.getAge());
//
//		List<User> users = userDao.selectList(lqw);
//		System.out.println(users);


		//查询投影
//		LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//		lqw.select(User::getId,User::getName,User::getAge);
//		List<User> users = userDao.selectList(lqw);
//		System.out.println(users);

//		QueryWrapper<User> lqw = new QueryWrapper<User>();
//		lqw.select("count(*) as count", "tel");
//		lqw.groupBy("tel");
//		List<Map<String, Object>> userList = userDao.selectMaps(lqw);
//		System.out.println(userList);

		//条件查询
//		LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//		lqw.eq(User::getName, "Jerry")
//		.eq(User::getPassword, "jerry1");
//
//		User loginUser = userDao.selectOne(lqw);
//		System.out.println(loginUser);

		LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();

		List<User> users = userDao.selectList(lqw);
		System.out.println(users);
	}

	@Test
	void testSave(){
		User user = new User();
//		user.setId(666L);
		user.setName("黑马程序员");
		user.setPassword("1232133214");
		user.setAge(12);
		user.setTel("3401413");
		userDao.insert(user);
	}
	@Test
	void testDelete(){
		//userDao.deleteById(1L);

		System.out.println(userDao.selectList(null));
	}

	@Test
	void testUpdate(){
//		User user = new User();
//		user.setId(3L);
//		user.setName("Jock666");
//		user.setPassword("tom888");
//		user.setVersion(1);
//		userDao.updateById(user);

		//1.先通过要修改的数据id将当前数据查询出来
		User user = userDao.selectById(3L);
		//2.将要修改的属性逐一设置进去
		user.setName("as000");
		userDao.updateById(user);
	}
}
