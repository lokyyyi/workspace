package com.silsub1.shape.model.vo;

public class Circle extends Shape{

	public static final double PI = Math.PI;
	
	private double radius;
	
	public Circle(){
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		double res = radius * radius * PI;
		return res;
	}
	public double perimeter() {
		double res = 2 * PI * radius;
		return res;
	}
}
