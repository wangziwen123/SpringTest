package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.Student;

@Repository(value = "stuDao")
public class StuDao {
	 

	public void addStudent(Student student) {
		System.out.println("��ӳɹ�");
	}
	
	public void checkStudent(int stuNo) {
		System.out.println("���ڼ����");
	}
	
	public void deleStudent(int stuNo) {
		System.out.println("ɾ���ɹ�");
	}
	
	public void queryStudent(int stuNo) {
		System.out.println("��ѯ�ɹ�");
	}
	
	public void yes() {
		System.out.println("�����ɹ�");
	}

}
