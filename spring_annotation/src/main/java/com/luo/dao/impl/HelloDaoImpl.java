package com.luo.dao.impl;

import org.springframework.stereotype.Repository;

import com.luo.dao.IHelloDao;

@Repository
public class HelloDaoImpl implements IHelloDao {

	public void sayHello() {
		System.out.println("hello spring annotation");
	}

}
