package com.aluo.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.aluo.domain.User;
import com.aluo.provider.dao.UserDao;
import com.aluo.service.UserService;

@Service(version = "1.0.0", interfaceName = "com.aluo.service.UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void register(User user) {
		userDao.register(user);
	}

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}
