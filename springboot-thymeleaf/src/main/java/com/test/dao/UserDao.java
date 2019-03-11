package com.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.test.domain.User;

@Mapper
public interface UserDao {
	public List<User> getUserList();

	public void insertUser(User user);
}
