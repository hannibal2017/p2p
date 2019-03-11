package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDao;
import com.test.domain.User;
import com.test.service.UserService;
/**
 * @Transactional加上，即可开启事务
 * @author luoluo
 *
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	public void insertUser(User user) {
		userDao.insertUser(user);
		int a = 1 / 0; //错误，用来测试事务
	}

}
