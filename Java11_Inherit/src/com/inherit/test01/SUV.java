package com.inherit.test01;

public class SUV extends Car {

	public SUV() {
		System.out.println("suv 생성");
	}
	public SUV(String color)	{
		super(color);
		System.out.println(color + "색 SUV생성");
	}
	
}
