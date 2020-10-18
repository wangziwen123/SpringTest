package com.entity;

public class Address {
	
	private String schoolAddress ;
	private String homeAddress ;
	
	
	public Address() {
		
	}
	

	public Address(String schoolAddress, String homeAddress) {
		super();
		this.schoolAddress = schoolAddress;
		this.homeAddress = homeAddress;
	}


	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Address [schoolAddress=" + schoolAddress + ", homeAddress=" + homeAddress + "]";
	}
	
	


}
