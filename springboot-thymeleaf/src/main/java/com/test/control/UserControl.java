package com.test.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.base.BaseController;
import com.test.domain.User;
import com.test.service.impl.UserServiceImpl;
import com.test.util.ResultUtil;

@RestController
public class UserControl extends BaseController {
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

	@RequestMapping("/getUserListToJsonString")
	public String getUserListToJsonString() {
		return ResultUtil.getJsonString(userService.getUserList());
	}
    
	/**
	 * extends BaseController类，输出字符串
	 */
	@RequestMapping("/getUserListToPrintJson")
	public void getUserListToPrintJson() {

		this.printJson(ResultUtil.getJsonString(userService.getUserList()));
	}
}
