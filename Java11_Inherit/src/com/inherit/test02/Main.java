package com.inherit.test02;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("이것이 자바다", "멀티", 100);
		Book b2 = new Book("이것이 디비다", "캠퍼스", 300);
		Book b3 = new Book("이것이 자바다", "멀티", 100);
		
		System.out.println(b1);
		System.out.println(b2.toString());
		System.out.println(b1.equals(b3));
		
		System.out.println(b1.hashCode());
		System.out.println(b3.hashCode());
		
		
	}
}
