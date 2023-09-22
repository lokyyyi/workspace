package com.poly.test05;

public class Profile {

	private String name;
	private String phone;
	
	public Profile() {
		
	}
	
	public Profile(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNaeme(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printProfile() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
	}
	
}
