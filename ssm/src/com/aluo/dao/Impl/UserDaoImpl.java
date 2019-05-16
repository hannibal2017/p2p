package com.aluo.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aluo.dao.UserDao;
import com.aluo.domain.User;
import com.aluo.mybatis.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	UserMapper userMapper;

	@Override
	public User selectUser(int id) {
		return userMapper.selectUser(id);
	}

	@Override
	public List<User> selectUserList() {
		return userMapper.selectUserList();
	}

	@Override
	public void inserttUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public void deleteUserById(int id) {
		userMapper.deleteUserById(id);
	}

}