package com.aluo.control;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public String hello(Model m) {
		m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
		return "hello"; // 视图重定向hello.jsp
	}
}