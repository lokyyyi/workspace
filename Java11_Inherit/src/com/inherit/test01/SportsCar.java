package com.inherit.test01;

public class SportsCar extends Car{
	public SportsCar() {
		System.out.println("sportscar 생성");
	}
	public SportsCar(String color)	{
		super(color);
		System.out.println(color + "색 sportscar생성");
	}

}
