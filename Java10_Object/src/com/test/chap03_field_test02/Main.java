package com.test.chap03_field_test02;

public class Main {

	public static void main(String[] args) {
		InitBlock p = new InitBlock();
		p.information();
		
		InitBlock p2 = new InitBlock("z플립", 200000, "samsung");
		p2.information();
		p.information();
	}
	
}