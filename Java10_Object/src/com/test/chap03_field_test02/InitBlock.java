package com.test.chap03_field_test02;

public class InitBlock {

	private String pName = "아이폰";
	private int price = 150000;
	private static String brand = "애플";
	
	public void information() {
		System.out.println(pName + "," + price + "," + brand );
	}
	
	public InitBlock() {
		
	}
	
	public InitBlock(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		InitBlock.brand = brand; //static필드이기때문
	}
}
