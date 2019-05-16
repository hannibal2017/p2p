package com.aluo.mybatis;

import java.util.List;

import com.aluo.domain.User;

public interface UserMapper {
	User selectUser(int id);

	List<User> selectUserList();

	void insertUser(User user);

	void deleteUserById(int id);
}