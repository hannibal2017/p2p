package com.luo.aop;

public class HelloAop {
	public void before() {
		System.out.println("before hello");
	}

	public void after() {
		System.out.println("after hello");
	}
	public void around() {
		System.out.println("around hello");
	}
}
