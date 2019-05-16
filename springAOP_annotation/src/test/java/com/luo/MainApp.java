package com.luo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luo.dao.IHelloDao;
import com.luo.service.IHelloService;
import com.luo.service.impl.HelloServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		IHelloService service = (IHelloService) context.getBean(HelloServiceImpl.class);

		IHelloDao helloDao = service.getHello();

		helloDao.sayHello();
	}

}
