package com.service;

import com.entity.Student;

public interface IStudentService {
	
	//���ѧ��
	void addStudent(Student student);
	
	//ɾ��ѧ��
	void deleStudent(int stuno);
	
	//��ѯѧ��
	void queryStudent(int stuno);
	
	//��ѯ����ѧ��
	void showStudent();

}
