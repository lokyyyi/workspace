package com.home.view;
import com.home.controller.Function;

import java.util.Scanner;

public class Menu {

	public static void displayMenu() {
		Function ft = new Function();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println("*** 변수/연산자/제어문 연습 프로그램 ***");
			System.out.println("1. 간단 계산기	=> calculator() 메소드 실행되게 함\n"
					+ "2. 작은수에서 큰수까지 합계구하기  => totalCalculator() 실행\n"
					+ "3. 신상정보 확인하기 => profile() 실행\n"
					+ "4. 학생정보 확인하기 => sungjuk() 실행\n"
					+ "5. 별과 숫자 출력하기 => printStarNumber() 실행\n"
					+ "6. 난수까지의 합게 구하기 => sumRandomNumber() 실행\n"
					+ "7. 구구단 => continueGugudan() 실행\n"
					+ "8. 주사위 숫자 알아맞추기 게임 => shutNumber() 실행\n"
					+ "9. 프로그램 종료");
			System.out.println("메뉴 번호 입력 : ");
			i = sc.nextInt();
			switch(i) {
				case 1: ft.calculator();
				break;
				case 2: ft.totalCalculator();
				break;
				case 3: ft.profile();
				break;
				case 4: ft.sungjuk();
				break;
				case 5: ft.printStarNumber();
				break;
				case 6: ft.sumRandomNumber();
				break;
				case 7: ft.continueGugudan();
				break;
				case 8: ft.shutNumber();
				break;
			}
		} while (i != 9);
	}
}
