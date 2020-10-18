package com.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.entity.Student;
import com.service.impl.StudentServiceImpl;


public class LogBefore implements MethodBeforeAdvice{
	/**
	 * Method arg0    ʱ�����õķ�����
	 * Object[] arg1   �����Ĳ���
	 * Object arg2    ���ô˷����Ķ���
	 */
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("**********************");
		
		System.out.println("ǰ��֪ͨ...");
		StudentServiceImpl stuserv = (StudentServiceImpl) arg2;
		stuserv.helloWorld();
		Student stu = (Student) arg1[0];
		System.out.println(stu.toString());
		
		
		
		System.out.println("**********************");
	}

}
