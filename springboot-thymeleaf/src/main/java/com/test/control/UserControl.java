package com.test.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.domain.User;
import com.test.service.UserService;
import com.test.service.impl.UserServiceImpl;

@RestController
public class UserControl {
	@Autowired
	private UserServiceImpl userService;

	@RequestMapping("/getUserList")
	public String getUserList() {
		return userService.getUserList().toString();
	}

	@RequestMapping("/insertUser")
	public void insertUser() {
		User user = new User();
		user.setPhone("888");
		user.setPassword("888");
		userService.insertUser(user);
		int a = 1 / 0;
	}
}
