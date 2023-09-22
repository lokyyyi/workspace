package com.silsub2.point.model.vo;

public class Circle extends Point{
	
	private int radius;
	
	public Circle() {
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		double area = Math.PI * radius * radius;
		double round = 2 * Math.PI * radius;
		
		System.out.println("X좌표 : " + x + "\nY좌표 : " + y + "\n면적 : " + String.format("%.2f", area) + 
				"\n둘레 : " + String.format("%.2f", round));
		
	}

}
