package com.aluo.test.service;

import java.util.List;

import com.aluo.test.domain.User;

public interface UserService {
	List<User> getUserList();
	
	void insertUser(User user);
}
