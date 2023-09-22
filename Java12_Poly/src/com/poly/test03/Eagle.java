package com.poly.test03;

public class Eagle extends Animal implements Bird {
	
	@Override
	public void fly() {
		//추상클래스에 animal 추상메소드 구현
		System.out.println("파닥파닥");
	}
	
	@Override
	public void bark() {
		//인터페이스 bird 추상메소드 구현
		System.out.println("웁니다.");
		
	}

}
