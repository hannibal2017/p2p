package com.aluo.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.aluo.base.BaseController;
import com.aluo.domain.User;
import com.aluo.service.UserService;

@RequestMapping("user")
@Controller
public class UserControl extends BaseController {
	@Reference(version = "1.0.0", check = false)
	private UserService userService;

	@RequestMapping("registerJsp")
	public String registerJsp(User obj) {
		User user = userService.login(obj);
		return "user/registerJsp";
	}

	@RequestMapping("register")
	public String register(User obj) {
		userService.register(obj);
		User user = userService.login(obj);
		request.getSession().setAttribute("user", user);
		return "redirect:/user/myAccount";
	}

	@RequestMapping("login")
	public String login(User obj) {
		User user = userService.login(obj);
		request.getSession().setAttribute("user", user);
		return "redirect:/user/myAccount";
	}

	// 调到登录页面
	@RequestMapping("/loginJsp")
	public String login(Model m) {
		return "user/loginJsp";
	}

	// 退出，后到我的账户页面
	@RequestMapping("/loginOut")
	public String loginOut(Model m) {
		this.getSession().invalidate();
		return "redirect:/user/loginJsp";
	}

	// 我的账户页面，JSP页面做了session校验。如果登录，提示欢迎信息；如果没有登录，调到登录页面。
	@RequestMapping("/myAccount")
	public String account(Model m) {
		return "user/myAccount";
	}
}
