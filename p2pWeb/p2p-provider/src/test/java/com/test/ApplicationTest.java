package com.test;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.aluo.ProviderApplication;
import com.aluo.provider.test.dao.UserDao;
import com.aluo.test.domain.User;
import com.aluo.test.service.UserService;
import com.aluo.util.exception.BusinessException;

@EnableTransactionManagement(proxyTargetClass = true)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
// @WebAppConfiguration
public class ApplicationTest {

	@Autowired
	UserDao userDao;

	@Resource
	private DataSource dataSource;

	@Resource
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void testRedis() {
		this.redisTemplate.opsForValue().set("study", "java");
		System.out.println(this.redisTemplate.opsForValue().get("study"));

	}

	@Test
	public void testQuery() throws Exception {
		List<User> users = userDao.getUserList();
		System.out.println(users.toString());
	}

	@Test
	public void test() {
		System.out.println("junit");
		throw new BusinessException("test exception");

	}

	@Test
	public void testDataSource() {
		System.out.println("datasource:" + this.dataSource);

	}

}
