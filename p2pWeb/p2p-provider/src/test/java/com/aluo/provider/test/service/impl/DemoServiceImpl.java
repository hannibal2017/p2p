package com.aluo.provider.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.aluo.service.DemoService;

@Service(version = "1.0.0", interfaceName = "com.aluo.service.DemoService")
public class DemoServiceImpl implements DemoService {

	@Override
	public String test() {
		return "恭喜连接成功";
	}

}
