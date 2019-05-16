package com.aluo.control;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aluo.domain.User;
import com.aluo.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/getUsser")
	public String getUser(ModelMap model) {
		model.addAttribute("user", userService.selectUser(3));
		return "user";
	}

	@RequestMapping("/selectUserList")
	public String selectUserList(ModelMap model) {
		model.addAttribute("userList", userService.selectUserList());
		return "userList";
	}

	@RequestMapping("/insertUser")
	public String insertUser(ModelMap model) {
		User user = new User(5, "555", "55555");
		userService.insertUser(user);
		model.addAttribute("message", "insert success");
		return "message";
	}

	@RequestMapping("/deleteUserById")
	public String deleteUserById(ModelMap model) {
		userService.deleteUserById(3);
		model.addAttribute("message", "delete success");
		return "message";
	}

	/**
	 * 跳转到注册页面
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/registerJsp")
	public String registerJsp() {
		return "registerJsp";
	}

	/**
	 * 注册后跳转到成功页面
	 * registerByForm
	 * @param user
	 * @return
	 */
	@RequestMapping("/registerByForm")
	public String registerByForm(User user) {
		System.out.println("phone: " + user.getPhone());
		System.out.println("password: " + user.getPassword());
		return "registerSuccess";
	}
}