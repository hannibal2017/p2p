package com.aluo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluo.dao.UserDao;
import com.aluo.domain.User;
import com.aluo.service.UserService;
import com.aluo.util.exception.BusinessException;

@Service
// @Transactional (propagation = Propagation.REQUIRED, rollbackFor =
// Throwable.class)
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User selectUser(int id) {
		return userDao.selectUser(id);
	}

	@Override
	public List<User> selectUserList() {
		return userDao.selectUserList();
	}

	@Override
	public void insertUser(User user) {
		userDao.inserttUser(user);
//		 int a = 12/0;
		throw new BusinessException("除数不能是0!");
	}

	@Override
	public void deleteUserById(int id) {
		userDao.deleteUserById(id);
	}

}