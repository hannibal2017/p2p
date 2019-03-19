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
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.test.domain.Member;
import com.test.domain.User;
import com.test.service.UserService;

@EnableTransactionManagement(proxyTargetClass = true)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
//@WebAppConfiguration
public class ApplicationTest {

	@Autowired
	UserService userService;

	@Resource
	private DataSource dataSource;
	
	@Resource
    private RedisTemplate<String, Object> redisTemplate;
    
	@Test
    public void testRedis() {
        this.redisTemplate.opsForValue().set("study", "java");
        System.out.println(this.redisTemplate.opsForValue().get("study"));
        
    }
	
	/**
	 * redis对象序列化
	 */
	@Test
    public void testRedisSeriable() {
        Member vo = new Member() ;
        vo.setMid("studyjava");
        vo.setAge(19);
        this.redisTemplate.opsForValue().set("study", vo);
        System.out.println(this.redisTemplate.opsForValue().get("study"));

    }

	@Test
	public void testQuery() throws Exception {
		List<User> users = userService.getUserList();
		System.out.println(users.toString());
	}

	@Test
	public void test() {
		System.out.println("junit");

	}

	@Test
	public void testDataSource() {
		System.out.println("datasource:" + this.dataSource);

	}
	
	@Test
	public void testInsertUser() {
		User user = new User();
		user.setPhone("777");
		user.setPassword("777");
		userService.insertUser(user); 
		}
}
