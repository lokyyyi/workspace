package com.silsub1.shape.model.vo;

public class Rectangle extends Shape{
	
	private double width;
	private double height;
	
	public Rectangle(){
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		double res = width * height;
		return res;
	}
	public double perimeter() {
		double res = 2 * (width + height);
		return res;
	}
}
