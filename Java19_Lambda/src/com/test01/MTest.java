package com.test01;



public class MTest {
	
	public static void main(String[] args) {
		//() -> {code}
		//() -> code;
		Test01 test01_1 = () -> {System.out.println("test01_1");};
		test01_1.prn();
		
		Test01 test01_2 = () -> System.out.println("test01_2");
		test01_2.prn();
		
		
		//(parameter) -> {code};
		//(parameter) -> code;
		Test02 test02_1 = (int n) -> {System.out.println("input: " + n);};
		test02_1.prn(1);
		Test02 test02_2 = (int n) -> System.out.println("input: " + n);
		test02_2.prn(2);
		//매개변수의 타입은 대부분 짐작이 가능하며 생략하는 경우가 많음
		Test02 test02_3 = (n) -> System.out.println("input: " + n);
		test02_3.prn(3);
		Test02 test02_4 = n -> System.out.println("input: " + n);
		test02_4.prn(4);
		
		/*Test var = n -> System.out.println("input: " + n);
		==>
		Test test = new Test() {
			void prn (int n) {
				System.out.println("intpu: " + n);
			}
		}
		
		==> 실행 var.prn(1);
		*/
		//(parameter) -> {code};
		Test03 test03 = n ->  n+n;
		System.out.println(test03.prn(4));
		
		
		Test04 test04 = (i, j) -> {
			System.out.println("input: " + i + " and " + j);
			return i*j;
		};
		
		System.out.println(test04.prn(10, 3));
		
		//----------------------
		MyCalc sum = (a,b) -> a+b;
		MyCalc sub = (a,b) -> a-b;
		MyCalc mul = (a,b) -> a*b;
		
		int i=10;
		int j=3;
		
		System.out.println(sum.calc(i, j));
		System.out.println(sub.calc(i, j));
		System.out.println(mul.calc(i, j));
	}

}
