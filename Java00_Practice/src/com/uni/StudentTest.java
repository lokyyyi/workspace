package com.uni;

public class StudentTest {

	public static void main(String[] args) {
		Human st1 = new Student("홍길동", 15, 171, 81, "201101", "영문");
		Human st2 = new Student("한사람", 13, 183, 72, "201102", "건축");
		Human st3 = new Student("임걱정", 16, 175, 65, "201103", "무용");
		
		Human stArr[] = {st1, st2, st3};
		
		
		System.out.println("이름" + "   나이" + "  신장" + "  몸무게" + " 학번  " + "   전공");
		for(int i=0; i<stArr.length; i++) {
			System.out.println(stArr[i].printInformation());
		}
	}
}
