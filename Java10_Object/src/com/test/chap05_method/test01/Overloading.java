package com.test.chap05_method.test01;

public class Overloading {

	public int test() {
		return 0;
	}
	
	public int test(int a) {
		return 0;
	}
	
	public int test(int a, int b) {
		return 0;
	}
	public int test(int a, String s) {
		return 0;
	}
	//public int test(int b, int a) {
		//return 0;
	//}
	public int test(String s, int a) {
		return 0;
	}
	public String test(int a, int b, String str) {
		return null;
	}
//	리턴타입의 다름은 오버로딩이 적용안됌
//	public int test(int a, int b, String str) {
//		return 0;
//	}
//	접근제한자는 오버로딩 안됌
//	private void test(int a, int b, String str) {	
//	}
}
