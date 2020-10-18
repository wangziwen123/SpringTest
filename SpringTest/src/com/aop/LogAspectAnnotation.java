package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //声明此类是一个通知
public class LogAspectAnnotation {
	
		//前置通知
		@Before("execution(public void com.service.impl.StudentServiceImpl.deleStudent(..))") //属性：定义切点
		public void myBefore(JoinPoint jp) {
			System.out.println("注解形式-前置通知：目标对象："+jp.getTarget()+",方法名："+jp.getSignature().getName() +",参数列表："+ jp.getArgs().length  );
		}
		
		
		//后置通知
		@AfterReturning( pointcut= "execution(public void com.service.impl.StudentServiceImpl.deleStudent(..))" ,returning="returningValue" ) 
		public void myAfter(JoinPoint jp,Object returningValue) {//returningValue是返回值，但需要告诉spring
			System.out.println("注解形式-后置通知：目标对象："+jp.getTarget()+",方法名："+jp.getSignature().getName() +",参数列表："+  jp.getArgs().length+",返回值："+returningValue );
		}
		
		//异常通知
		@AfterThrowing(pointcut= "execution(public void com.service.impl.StudentServiceImpl.deleStudent(..))",throwing="e")
		public void myException(JoinPoint pj, NullPointerException e) {//此异常通知 只会捕获NullPointerException类型的异常
			System.out.println("注解形式-异常通知----e:"+e.getMessage());
		}
		
		//最终通知
		@After("execution(public void com.service.impl.StudentServiceImpl.deleStudent(..))")
		public void myAfter() {
			System.out.println("注解形式-最终通知-----通知----");
		}
		
		/*环绕通知 ,参数ProceedingJoinPoint
		@Around("execution(public * addStudent(..))")
		public void myAround(ProceedingJoinPoint jp  ) {
			//方法之前：前置通知
			System.out.println("《【环绕】方法之前：前置通知");
			
			try {
				//方法执行时
				jp.proceed() ;//执行方法
		
				//方法之前之后：后置通知
				System.out.println("《【环绕】方法之前之后：后置通知");
			}catch(Throwable e) {
				//发生异常时：异常通知
				System.out.println("《【环绕】发生异常时：异常通知");
			}finally {
				//最终通知
				System.out.println("《【环绕】最终通知");
			}
		}*/
		

}
