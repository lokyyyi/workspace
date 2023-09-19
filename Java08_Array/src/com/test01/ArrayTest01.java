package com.test01;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		char carr[] = new char[10];
		
		System.out.println("arr - " + arr);
		System.out.println("carr - " + carr);
		
		System.out.println("arr의 hashcode - " + arr.hashCode());
		System.out.println("carr의 hashcode - " + carr.hashCode());
		
		System.out.println("arr 길이- " + arr.length);
		System.out.println("carr 길이 - " + carr.length);
		
	}

}
