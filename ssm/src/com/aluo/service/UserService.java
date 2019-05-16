package com.aluo.service;

import java.util.List;

import com.aluo.domain.User;

public interface UserService {
	User selectUser(int id);

	List<User> selectUserList();

	void insertUser(User user);

	void deleteUserById(int id);
}