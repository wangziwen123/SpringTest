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
			System.out.println("�û���֪ͨʵ�ֵ�[ǰ��֪ͨ]...");
			System.out.println("*********************************************");
			System.out.println(" ");
			
			// invocation.proceed() ֮ǰ�Ĵ��룺ǰ��֪ͨ
			 result  = invocation.proceed() ;//������Ŀ�귽����ִ��  ��addStudent()
			//result ����Ŀ�귽��addStudent()�����ķ���ֵ
//			 invocation.proceed() ֮��Ĵ��룺����֪ͨ
			System.out.println(" ");
			System.out.println("*********************************************");
			System.out.println("�û���֪ͨʵ�ֵ�[����֪ͨ]...:");
			System.out.println("Ŀ�����target"+invocation.getThis()+",���õķ�������"+invocation.getMethod().getName()+",�����Ĳ�����"+invocation.getArguments().toString()+",����ֵ��"+result);
			System.out.println("*********************************************");
			System.out.println(" ");

			
		}catch(Exception e) {
			//������3...
			//�쳣֪ͨ
			System.out.println("�û���֪ͨʵ�ֵ�[�쳣֪ͨ]...");
		}
		
		return result;
	}
	

}
