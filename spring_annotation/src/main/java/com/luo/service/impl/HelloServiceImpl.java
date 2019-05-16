package com.luo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.luo.dao.IHelloDao;
import com.luo.service.IHelloService;

@Service
public class HelloServiceImpl implements IHelloService {
	@Autowired
//	@Qualifier("myQualifier")
	private IHelloDao hello;

	public IHelloDao getHello() {
		return hello;
	}

}
