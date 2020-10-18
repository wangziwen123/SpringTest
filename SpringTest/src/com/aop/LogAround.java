package com.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result  = null ;
		System.out.println(" ");
		System.out.println("*********************************************");
		try {
			System.out.println("用环绕通知实现的[前置通知]...");
			System.out.println("*********************************************");
			System.out.println(" ");
			
			// invocation.proceed() 之前的代码：前置通知
			 result  = invocation.proceed() ;//控制着目标方法的执行  ，addStudent()
			//result 就是目标方法addStudent()方法的返回值
//			 invocation.proceed() 之后的代码：后置通知
			System.out.println(" ");
			System.out.println("*********************************************");
			System.out.println("用环绕通知实现的[后置通知]...:");
			System.out.println("目标对象target"+invocation.getThis()+",调用的方法名："+invocation.getMethod().getName()+",方法的参数："+invocation.getArguments().toString()+",返回值："+result);
			System.out.println("*********************************************");
			System.out.println(" ");

			
		}catch(Exception e) {
			//方法体3...
			//异常通知
			System.out.println("用环绕通知实现的[异常通知]...");
		}
		
		return result;
	}
	

}
