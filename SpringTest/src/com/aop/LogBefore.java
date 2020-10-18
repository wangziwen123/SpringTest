package com.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.entity.Student;
import com.service.impl.StudentServiceImpl;


public class LogBefore implements MethodBeforeAdvice{
	/**
	 * Method arg0    时被调用的方法名
	 * Object[] arg1   方法的参数
	 * Object arg2    调用此方法的对象
	 */
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("**********************");
		
		System.out.println("前置通知...");
		StudentServiceImpl stuserv = (StudentServiceImpl) arg2;
		stuserv.helloWorld();
		Student stu = (Student) arg1[0];
		System.out.println(stu.toString());
		
		
		
		System.out.println("**********************");
	}

}
