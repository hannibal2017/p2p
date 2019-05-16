package com.luo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAop {
	/**
	 * 第二种方式：先定义@Pointcut，然后在对应的地方引用其函数名，参考方法@Around("pointCut()")
	 */
	@Pointcut("execution(* com.luo.dao.impl.*.*(..))")
	@Order(2) // Order 代表优先级，数字越小优先级越高
	public void pointCut() {
	};

	@Before("execution(* com.luo.dao.impl.*.*(..))")
	public void before() {
		System.out.println("before hello");
	}

	@After("execution(* com.luo.dao.impl.*.*(..))")
	public void after() {
		System.out.println("after hello");
	}

	// @Around("execution(* com.luo.dao.impl.*.*(..))")
	@Around("pointCut()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		// start stopwatch
		System.out.println("around begin");
		Object retVal = pjp.proceed();
		System.out.println("around end");
		// stop stopwatch
		return retVal;
	}

	@AfterThrowing("execution(* com.luo.dao.impl.*.*(..))")
	public void afterThrowing() {
		System.out.println("afterThrowing hello");
	}
}
