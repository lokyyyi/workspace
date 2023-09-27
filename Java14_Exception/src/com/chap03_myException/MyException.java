package com.chap03_myException;

public class MyException extends Exception {	//Exception상속받아 예외클래스로 선언
	//기본생성자
	public MyException() {
		
	}
	
	//매개변수
	public MyException(String a) {
		super(a);
	}

}
