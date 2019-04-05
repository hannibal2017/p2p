package com.aluo.provider.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.aluo.provider.test.dao.UserDao;
import com.aluo.test.domain.User;
import com.aluo.test.service.UserService;
@Service(version = "1.0.0", interfaceName = "com.aluo.test.service.UserService")
public class UserImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public void insertUser(User user) {
		try {
			userDao.insertUser(user);
//			int a = 1 / 0; //错误，用来测试事务
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
