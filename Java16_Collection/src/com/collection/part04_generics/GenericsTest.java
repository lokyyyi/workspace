package com.collection.part04_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GenericsTest {
	public static void main(String[] args) {
		GenericsTest gt = new GenericsTest();
		gt.test2();
	}

	public void test1() {
		List list = new ArrayList();

		//컬렉션은 모든 타입의 객체 저장 가능.
		
		list.add(new String("Object"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		//저장된 객체를 꺼내 사용할 때
		//하나하나 instanceof 비교하고 타입 확인 후 사용
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			if(obj instanceof Book) {
				((Book)obj).printBook();
			}
			if(obj instanceof Student) {
				((Student)obj).score();
			}
		}
	}
	
	public void test2() {
		
		// 제네릭스 : 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능
		// 컬렉션에 한가지 종류의 객체만 저장할때 사용 -> 컬렉션에서 꺼내 사용할때 형변환 작업 생략 가능
		//
		ArrayList<Book> list = new ArrayList<Book>();
		//무조건 Book 타입의 객체만 저장 가능한 ArrayList
		ArrayList list2 = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());
		
		list2.add(new Book());
		list2.add(new Book());
		
		for(Book b : list) {
			b.printBook();
		}
		for(Object o : list2) {
			((Book)o).printBook();
		}
		
		Map<String, Book>map = new HashMap<String, Book>();
		
	}
	
	public List<Book> test3(){
		List<Book> list = new ArrayList<Book>();
		return list;
	}
}

//한 클래스 파일안에 여러개 클래스 정의 가능
//접근제한자는 1개에만 붙일 수 있다.
class Book{
	private String title;

	public Book(){}

	public Book(String title){
		this.title = title;
	}

	public void printBook(){
		System.out.println("printBook() call...");
	}
	@Override
	public String toString(){
		return "Book";
	}

}

class Student{
	public Student(){}

	public void score(){
		System.out.println("score() call...");

	}
	@Override
	public String toString(){
		return "Student";
	}

}


class Car{
	public Car(){}

	public void printCar(){
		System.out.println("printCar() call...");
	}
	@Override
	public String toString(){
		return "Car";
	}

}
