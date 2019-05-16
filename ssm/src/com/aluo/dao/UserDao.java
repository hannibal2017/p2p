package com.aluo.dao;

import java.util.List;

import com.aluo.domain.User;

public interface UserDao {
	User selectUser(int id);

	List<User> selectUserList();

	void inserttUser(User user);

	void deleteUserById(int id);
}