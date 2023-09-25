package com.chap04_wrapperClass.run;


public class Run {
	
	/*
	 * WrapperClass
	 * 	-프로그램에 따라 기본타입의 데이터를 객체로 취급해야하는 경우가 있다
	 *	 기본타입의 데이터를 그대로 사용할 수 없기에 객체로 변환 후 작업을 수행해야 한다.
	 * 	 8개의 기본타입에 해당하는 객체로 포장해주는 클래스가 WrapperClass이다.
	 * 
	 * 	 Boxing : 기본자료형 을 Wrapper클래스 객체로 변형(AutoBoxing : 자동처리)
	 * 	 UnBoxing : Wrapper 클래스 > 기본자료형(AutoUnBoxing : 자동처리)
	 * 
	 */
	public static void main(String[] args)	{
		Integer i = new Integer(10);
		Integer i2 = new Integer(15);
		Double d = new Double(10.1);
		
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2));
		
		
		//AutoBoxing
		Short i3 = 10;
		Integer i4 = 5;
		Double d2 = 5.0;
	
		//UnBoxing
		int a = i4.intValue();
		double b = d2.doubleValue();
		
		//AutoUnBoxing
		
		int a2 = i4;
		double b2 = d2;
		
		System.out.println(a2+b2);
		abox(a2);
	}
	
	public static void abox(Object obj) {
		System.out.println(obj);
	}

}
