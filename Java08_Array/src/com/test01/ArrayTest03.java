package com.test01;
import java.util.Arrays;

public class ArrayTest03 {
	
	public static void main(String[] args) {
		char[] ch = new char[26];
		for(int i=0; i<26; i++) {
			ch[i] = (char)((int)'a'+i);
		}
		
		ArrayTest03.prn(ch);
		System.out.println();
		ArrayTest03.reverse(ch);
		System.out.println();
		ArrayTest03.upper(ch);
		
		//1. a~z 일차원 배열 출력 - prn(ch);
		//2. 만든 배열(ch)를 거꾸로 출력
		//3. 만든 배열(ch)를 대문자로 변경
		
	}
	
	public static void prn(char[] ch) {
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
	
	public static void reverse(char[] ch) {
		for(int i=(ch.length)-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
		
	}
	
	public static void upper(char[] ch) {
		for(int i=0; i<ch.length; i++) {
			char[] a = new char[26];
			a[i] = Character.toUpperCase(ch[i]);
			System.out.print(a[i]);
		}
	}

}
