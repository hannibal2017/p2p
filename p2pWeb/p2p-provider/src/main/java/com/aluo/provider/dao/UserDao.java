package com.aluo.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aluo.domain.User;

@Mapper
public interface UserDao {
	void register(User user);

	User login(User user);

	List<User> getUserList();
}
