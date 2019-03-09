package com.luo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.luo.test.DemoService;

@Service(version = "1.0.0", interfaceName = "com.luo.test.DemoService")
public class DemoServiceImpl implements DemoService {

	@Override
	public String test() {
		return "恭喜连接成功";
	}

}
