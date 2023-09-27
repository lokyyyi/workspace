package com.chap01_runtimeException.run;

public class RunExcep {

	public static void main(String[] args) {
		RunExcep re = new RunExcep();
		//re.test01();
		re.test02();
		

	}
	
	public void test01() {
		//ArithmeticException
		/*int no1 = 10, no2 = 0;
		int res = 0;
		
		res = no1/no2;
		System.out.println("res: " + res);*/

		/*int no1 = 10, no2 = 0;
		int res = 0;
		if(no2 == 0){
			System.out.println("0입니다 나눌 수 없습니다.");
		}else 
		
		res = no1/no2;
		System.out.println("res: " + res);*/
		
		int no1 = 10, no2 = 0;
		int res = 0;
		
		try {
			res = no1/no2;
			System.out.println("res: " + res);
		}catch(ArithmeticException e) {
			System.out.println("arith 발생");
			System.out.println("0으로 나눌 수 없음");
		}
	}
	
	public void test02() {
		//ClassCastException : 허용되지 않은 형변환 연산 진행
		/*Object obj = 'a'; // char >> (Boxing) >> character >> 다형성 obj
		System.out.println(obj);
		String str = (String)obj; 		//classcastException
		System.out.println(str);*/
		
		Object obj = 'a'; // char >> (Boxing) >> character >> 다형성 obj
		System.out.println(obj);
		
		if(obj instanceof String) {
			String str = (String)obj;
			System.out.println("str" + str);
		}else if(obj instanceof Character) {
			char ch = (Character)obj;
			System.out.println("char" + ch);
		}
		
		System.out.println();
		//ArrayIndexOutOfBoundsException
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		
		//arr[2] = 3;
		
		for(int i=0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		//NullPointerException 
		String str = null;
		
		//int length = str.length();
		
		RunExcep r = new RunExcep();
		
		str = r.res();
		System.out.println("str의 length: " + str.length());
		
	}
	
	public String res() {
		return null;
	}
}
