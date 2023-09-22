package com.silsub1.book.main;
import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("자바", "철수", 10000);
		Book b2 = new Book("디비", "영희", 20000);
		
		System.out.println("b1 toString");
		System.out.println(b1.toString());
		System.out.println("b2 toString");
		System.out.println(b2.toString());
		System.out.println("b1 equals b2");
		b1.equals(b2);
		
		//얕은복사
		Book b3 = b1;
		System.out.println("얕은복사 주소비교");
		System.out.println(b1 == b3);
		System.out.println("얕은복사 내용비교");
		System.out.println(b1.equals(b3));
		
		//깊은 복사
		Book b4 = new Book(b2);
		System.out.println("깊은복사 주소비교");
		System.out.println(b2 == b4);
		System.out.println("깊은복사 내용비교");
		System.out.println(b2.equals(b4));
		
	}
}
