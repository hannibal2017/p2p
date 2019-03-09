package com.luo.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.luo.test.DemoService;

@RequestMapping("test")
@RestController
public class TestControl {

	@Reference(version = "1.0.0", check = false)
	private DemoService demoService;

	@RequestMapping("getMessage")
	public String test() {
		System.out.println("getMessage:" + demoService.test());
		return "OK:返回信息=" + demoService.test();
	}

	@RequestMapping("index")
	public String index() {
		return "你好啊";
	}
}
