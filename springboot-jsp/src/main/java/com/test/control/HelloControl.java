package com.test.control;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.base.BaseController;
import com.test.domain.User;

@Controller
public class HelloControl extends BaseController {
	@RequestMapping("/hello")
	public String hello(Model m) {
		m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
		return "hello";
	}

	@RequestMapping("/testAjax")
	public String testAjax(Model m) {
		m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
		return "testAjax";
	}

	// 调到登录页面
	@RequestMapping("/login")
	public String login(Model m) {
		return "user/login";
	}

	// 登录后调到成功页面
	@RequestMapping("/loginAction")
	public String loginAction(Model m) {
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		User user = new User(phone, password);
		System.out.println(phone);
		System.out.println(password);
		request.getSession().setAttribute("user", user);
		return "user/loginSuccess";
	}

	// 退出，后到我的账户页面
	@RequestMapping("/loginOut")
	public String loginOut(Model m) {
		this.getSession().invalidate();
		return "redirect:/myAccount";
	}

	// 我的账户页面，JSP页面做了session校验。如果登录，提示欢迎信息；如果没有登录，调到登录页面。
	@RequestMapping("/myAccount")
	public String account(Model m) {
		return "user/myAccount";
	}
}
