package com.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component(value = "Student7")
public class Student implements InitializingBean,DisposableBean{
	
	private int stuNo ;
	private String stuName ;
	private int stuAge ;
	private boolean stuSex ;
	private Address stuAddress ;
	
	public Student() {
		
	}
	
	@PostConstruct
	public  void annocationInit() {
		System.out.println("注解形式的初始化方法>>>>>>>>>>>>>>>>");
	}
	
	@PreDestroy
	public  void annocationDestroy() {
		System.out.println("注解形式的初始化方法>>>>>>>>>>>>>>>>");
	}
	
	public void initTest() {
		System.out.println("基于Java配置文件的StudentBean初始化方式>>>>>>>>>>>>>>>>>");
	}
	
	public void destroyTest() {
		System.out.println("基于Java配置文件的StudentBean销毁方式>>>>>>>>>>>>>>>>>");
	}
	
	
	 

	public Student(int stuNo, String stuName, int stuAge, boolean stuSex, Address stuAddress) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuAddress = stuAddress;
	}





	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public boolean isStuSex() {
		return stuSex;
	}

	public void setStuSex(boolean stuSex) {
		this.stuSex = stuSex;
	}

	public Address getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(Address stuAddress) {
		this.stuAddress = stuAddress;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuSex=" + stuSex
				+ ", stuAddress=" + stuAddress + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("实现InitializingBean接口的Bean销毁方式>>>>>>>>>>>>>>");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("实现InitializingBean接口的Bean初始化方式>>>>>>>>>>>>>>");
		
	}
	
	

}
