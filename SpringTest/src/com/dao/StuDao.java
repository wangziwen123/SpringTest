package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.Student;

@Repository(value = "stuDao")
public class StuDao {
	 

	public void addStudent(Student student) {
		System.out.println("添加成功");
	}
	
	public void checkStudent(int stuNo) {
		System.out.println("正在检查中");
	}
	
	public void deleStudent(int stuNo) {
		System.out.println("删除成功");
	}
	
	public void queryStudent(int stuNo) {
		System.out.println("查询成功");
	}
	
	public void yes() {
		System.out.println("操作成功");
	}

}
