package com.test.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.test.domain.User;

public interface UserService {
	public List<User> getUserList();

	public void insertUser(User user);
}
