package com.poly.test04;

import java.util.Scanner;

public class Circle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력: ");
		int r = sc.nextInt();
		
		double res = r*r*Math.PI;
		super.setResult(String.format("%.2f", res));
		//super 없어도 상관 x
	}
	
	@Override
	public void print() {
		System.out.println("원의 ");
		super.print();
	}
}
