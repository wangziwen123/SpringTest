package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.Config1;
import com.dao.StuDao;
import com.entity.Address;
import com.entity.Student;
import com.service.IStudentService;
import com.service.impl.StudentServiceImpl;

public class Test {
	
	public static void main(String[] args) {
//		new Test().StduentIocTest() ;
//		new Test().AnnocationTest() ;
//		new Test().AopXMLTest() ;
//		new Test().AopAnnotationTest() ;
		new Test().AnnotationScan();
	}
	public void AnnotationScan() {    //JAVA����ע�����DI��ʽ
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config1.class) ;
		
		StuDao studao = (StuDao) context.getBean("stuDao");
		IStudentService stuservice = (IStudentService) context.getBean("StuService");
		System.out.println(stuservice.toString());
		System.out.println(studao.toString());
		System.out.println(context.getBean("stuDao").toString());
		System.out.println(context.getBean("student3").toString());
		System.out.println(context.getBean("address3").toString());
		System.out.println("ԭ��ģʽ��"+context.getBean("address3").equals(context.getBean("address3")));
		System.out.println("����ģʽ��"+context.getBean("student3").equals(context.getBean("student3")));
		System.out.println("import��ʽ��DI��������------------->>>>>>>>>>");
//		System.out.println(context.getBean("com.entity.Students").toString());
//		System.out.println(context.getBean("com.entity.Student").toString());
		System.out.println(context.getBean("student5").toString());
		System.out.println(context.getBean("students").toString());
		System.out.println(context.getBeanFactory());
		System.out.println("Bean�ĸ�����"+context.getBeanDefinitionCount());
		
		stuservice.addStudent(new Student());
		
//		//��ӡ���е�bean
//		System.out.println("��ӡ��IOC���������е�Bean");
//		String[] stus = context.getBeanDefinitionNames();
//		for (String ob : stus) {
//			System.out.println(ob.toString());
//		}

	}
	
	public void AopAnnotationTest() {    //ע�⣫���AOP���÷�ʽ
		System.out.println("---------------------------------");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ConfigeAOP.xml") ;
		IStudentService stuservice = (IStudentService) context.getBean("stuSerice1");
		stuservice.deleStudent(1);
		System.out.println("---------------------------------");
		
		System.out.println("��ӡ��IOC���������е�Bean");
		String[] stus = context.getBeanDefinitionNames();
		for (String ob : stus) {
			System.out.println(ob.toString());
		}
	}
	
	public void AopXMLTest() {    //XML���÷�ʽ��AOP
		System.out.println("---------------------------------");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ConfigeAOP.xml") ;
		IStudentService stuservice = (IStudentService) context.getBean("stuSerice1");
		stuservice.addStudent(new Student(1,"����",23,true,null));
		System.out.println("---------------------------------");
		
		System.out.println("��ӡ��IOC���������е�Bean");
		String[] stus = context.getBeanDefinitionNames();
		for (String ob : stus) {
			System.out.println(ob.toString());
		}
	}
	
	public void AnnocationTest() {   //ע�ⷽʽ��ע�����
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml") ;
		StuDao studao = (StuDao) context.getBean("stuDao");
		studao.addStudent(new Student());
		
		StudentServiceImpl stuservice = 
				(StudentServiceImpl) context.getBean("StuService");
		stuservice.addStudent(new Student());
		
		System.out.println("��ӡ��IOC���������е�Bean");
		String[] stus = context.getBeanDefinitionNames();
		for (String ob : stus) {
			System.out.println(ob.toString());
		}
	}
	
	public void StduentIocTest() { 		//setter�͹������ķ�ʽע�����
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml") ;
		Student stu = (Student) context.getBean("student1");
		System.out.println(stu.toString());
		Address addr = (Address) context.getBean("address1");
		System.out.println(addr.toString());
		Student stu1 = (Student) context.getBean("student3");
		System.out.println(stu1.toString());
		Address addr1 = (Address) context.getBean("address2");
		System.out.println(addr1.toString());
		System.out.println(context.getBean("stulist"));
		
		System.out.println("------------------------");
		
		System.out.println("��ӡ��IOC���������е�Bean");
		String[] stus = context.getBeanDefinitionNames();
		for (String ob : stus) {
			System.out.println(ob.toString());
		}
	}

}
