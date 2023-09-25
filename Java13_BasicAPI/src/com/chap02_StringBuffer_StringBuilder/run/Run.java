package com.chap02_StringBuffer_StringBuilder.run;

public class Run {
	
	public static void main(String[] args) {
		//StringBuffer와 StringBuilder는 메소드가 동일.
		StringBuilder sb = new StringBuilder("우리는 ");
		System.out.println(sb);
		sb.append("오늘도").append("열심히");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.insert(0, "밥을 먹고 난 후 ");
		System.out.println(sb);
		sb.delete(0, 10);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
