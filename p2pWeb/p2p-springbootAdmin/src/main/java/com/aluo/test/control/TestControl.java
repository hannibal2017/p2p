package com.aluo.test.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.aluo.base.BaseController;
import com.aluo.service.DemoService;
import com.aluo.test.domain.User;
import com.aluo.test.service.UserService;
import com.aluo.util.ResultUtil;

@RequestMapping("test")
@RestController
public class TestControl extends BaseController {
	@Reference(version = "1.0.0", check = false)
	private DemoService demoService;

	@Reference(version = "1.0.0", check = false)
	private UserService userService;

	@RequestMapping("getMessage")
	public String test() {
		System.out.println("getMessage:" + demoService.test());
		return "OK:返回信息=" + demoService.test();
	}

	// @RequestMapping("getUserList")
	// public String getUserList() {
	// System.out.println("userService:" + userService );
	// System.out.println("getUserList:" + userService.getUserList());
	// return "OK:返回信息=" + userService.getUserList().toString();
	// }

	@RequestMapping("getUserList")
	public void getUserList() {
		this.printJson(ResultUtil.getJsonString(userService.getUserList()));
	}

	@RequestMapping("insertUser")
	public void insertUser() {
		User user = new User();
		user.setPhone("1010");
		user.setPassword("1010");
		userService.insertUser(user);
	}
}
