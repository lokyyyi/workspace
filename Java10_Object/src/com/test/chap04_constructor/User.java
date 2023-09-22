package com.test.chap04_constructor;

import java.util.Date;

public class User {

	private String userId;
	private String userPwd;
	private String userName;
	private Date date;
	
	public User() {
	
	}
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, Date date) {
		/*this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;*/
		this(userId, userPwd, userName);
		this.date = date;
	}
	
	
	//생성자
	//1. 객채를 생성해 주기 위한 목적
	//2. 매개변수로 전달받은 값으로 필드를 초기화 할 목적
	
	//주의할 점
	//1. 반드시 클래스명과 동일하게 생성
	//2. 리턴형이 존재 X
	//3. 
	
	public void information() {
		System.out.println(userId + ", " + userPwd+ ", " + userName+ ", " + date);
	}
	
}
