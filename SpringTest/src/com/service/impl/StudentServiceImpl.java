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
	
//	@Autowired   //���������Զ�ע��,�������setter����
	StuDao studao ;

	@Override
//	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
//	���������ע��
	public void addStudent(Student student) {
		studao.checkStudent(1);
		studao.addStudent(new Student());
		studao.yes();
		System.out.println("��ӳɹ� --���񼶱�");
		
	}
	
	@Override
	public void deleStudent(int stuno) {
		studao.checkStudent(1);
		studao.deleStudent(1);
		studao.yes();
		System.out.println("ɾ���ɹ� --���񼶱�");
	}
	
	@Override
	public void queryStudent(int stuno) {
		
		System.out.println("��ѯ�ɹ� --���񼶱�");
		
	}
	
	@Override
	public void showStudent() {
		
		System.out.println("��ʾ����ѧ�� --���񼶱�");
		
	}
	
	public void helloWorld() {
		System.out.println("Hello World!!!!!");
	}
	
	
	public StuDao getStudao() {
		return studao;
	}
	
	@Autowired  //�����setter�����Զ�ע��
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
