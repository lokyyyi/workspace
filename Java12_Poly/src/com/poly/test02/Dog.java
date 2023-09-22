package com.poly.test02;

public class Dog implements Animal {
	
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	@Override
	public void eat(String feed) {
		System.out.println("강아지가 " + feed + " 먹는다!!");
	}

}
