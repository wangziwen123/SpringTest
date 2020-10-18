package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StuDao;
import com.entity.Student;
import com.service.IStudentService;

@Service(value = "StuService")
public class StudentServiceImpl implements IStudentService{
	
//	@Autowired   //根据类型自动注入,不会调用setter方法
	StuDao studao ;

	@Override
//	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
//	开启事务的注解
	public void addStudent(Student student) {
		studao.checkStudent(1);
		studao.addStudent(new Student());
		studao.yes();
		System.out.println("添加成功 --事务级别");
		
	}
	
	@Override
	public void deleStudent(int stuno) {
		studao.checkStudent(1);
		studao.deleStudent(1);
		studao.yes();
		System.out.println("删除成功 --事务级别");
	}
	
	@Override
	public void queryStudent(int stuno) {
		
		System.out.println("查询成功 --事务级别");
		
	}
	
	@Override
	public void showStudent() {
		
		System.out.println("显示所有学生 --事务级别");
		
	}
	
	public void helloWorld() {
		System.out.println("Hello World!!!!!");
	}
	
	
	public StuDao getStudao() {
		return studao;
	}
	
	@Autowired  //会调用setter方法自动注入
	public void setStudao(@Autowired StuDao studao) {
		this.studao = studao;
	}

	public StudentServiceImpl(StuDao studao) {
		super();
		this.studao = studao;
	}
	
	public StudentServiceImpl() {

	}
}
