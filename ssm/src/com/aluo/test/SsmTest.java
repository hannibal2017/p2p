package com.aluo.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aluo.dao.UserDao;
import com.aluo.domain.User;
import com.aluo.mybatis.UserMapper;
import com.aluo.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SsmTest {
	private static Logger logger = Logger.getLogger(SsmTest.class);
	@Autowired
	private UserService userService;

	@Test
	public void test() {
		System.out.println("begin");
		System.out.println(userService.selectUser(3));
		System.out.println("end");
		// User user = new User(2, "999", "999");
		// userService.insertUser(user);
		// logger.info("value:" + userMapper.selectUser(3));
	}
}