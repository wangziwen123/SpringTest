package com.entity;

import java.util.List;

public class Students {
	private List<Student> stuList;

	public Students(List<Student> stuList) {
		super();
		this.stuList = stuList;
	}

	public List<Student> getStuList() {
		return stuList;
	}
	
	

	public Students() {
		super();
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}

	@Override
	public String toString() {
		return "Students [stuList=" + stuList + "]";
	}
	

}
