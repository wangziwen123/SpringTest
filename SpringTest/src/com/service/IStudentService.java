package com.service;

import com.entity.Student;

public interface IStudentService {
	
	//添加学生
	void addStudent(Student student);
	
	//删除学生
	void deleStudent(int stuno);
	
	//查询学生
	void queryStudent(int stuno);
	
	//查询所有学生
	void showStudent();

}
