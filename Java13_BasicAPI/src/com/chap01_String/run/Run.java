package com.chap01_String.run;

public class Run {
	/*
	 * api : Application Programing Interface, 응용프로그램 프로그래밍 인터페이스
	 * 		 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻함.
	 * 		 자바를 사용하면서 코딩을 쉽게 할 수 있도록 기능등을 만들어 놓은것
	 */
	public static void main(String[] args) {
		Run.method1();
		Run.method2();
	}
	

	public static void method1() {
		//String 클래스
		
		//1. 문자열을 리터럴로 생성
		String str1 = "abc";
		String str2	= "abc";
		
		System.out.println(str1);
		System.out.println(str2);
			
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//String class 에서 오버라이딩 된 hashcode()가 아닌 객채별 고유 hashcode를 출력
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		//2. 생성자를 통한 문자열 생성
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	
	}
	
	public static void method2() {
		String str = "오후수업 시작! ";
		System.out.println("str : " + str + ", 주소 : " + System.identityHashCode(str));
		
		str += "화이팅!";
		System.out.println("str 추가 후 : " + str + ", 주소 : " + System.identityHashCode(str));
		
		//StringBuffer, StringBuilder
		StringBuffer sbf = new StringBuffer("4교시에요!");
		System.out.println("sbf: " + sbf + ", 주소: " + System.identityHashCode(sbf));
		
		sbf.append("잠이 오면...");
		System.out.println("sbf 추가 후 :" + sbf + ", 주소: " + System.identityHashCode(sbf));
	}

}
