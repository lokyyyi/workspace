package com.poly.test03;

public class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("고양이는 " + feed + " 먹는다!!" );
	}

}
