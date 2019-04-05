package com.aluo.service;

import java.util.List;

import com.aluo.domain.User;

public interface UserService {
	void register(User user);

	User login(User user);

	List<User> getUserList();
}
