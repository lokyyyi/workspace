package com.home.controller;
import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	
	public void calculator() {
		int res = 0;
		System.out.println("정수입력 1번");
		int i = sc.nextInt();
		System.out.println("정수입력 2번");
		int j = sc.nextInt();
		System.out.println("연산문자입력 (+,-,*,/)");
		char x = sc.next().charAt(0);
		switch(x) {
			
			case '+' : res = i+j;
			break;
			case '-' : res = i-j;
			break;
			case '*' : res = i*j;
			break;
			case '/' : if(j == 0) {
						System.out.println("0으로 나눌 수 없습니다.");
						break;
						}
						res = i/j;
			break;
		}
		System.out.println("결과 값: " + res);
		System.out.println();
		System.out.println();
	}
	
	public void totalCalculator() {
		System.out.println("정수입력");
		int i = sc.nextInt();
		System.out.println("정수입력");
		int j = sc.nextInt();
		int res = 0;
		if(i < j) {
			for(int k=0; k<=(j-i); k++) {
				res += i+k;
			}System.out.println(i + "부터 " + j + "까지 정수들의 합계 : " + res);
		}else if(j < i) {
			for(int k=0; k<=(i-j); k++) {
				res += j+k;
			}System.out.println(j + "부터 " + i + "까지 정수들의 합계 : " + res);
		}else System.out.println("합계 : " + i);
	}
	
	public void profile() {
		System.out.println("이름입력");
		String name = sc.nextLine();
		System.out.println("나이입력");
		int age = sc.nextInt();
		System.out.println("성별입력(남자/여자)");
		String sex = sc.next();
		System.out.println("성격입력");
		String sk = sc.next();
		
		System.out.println("이름 : " + name + "\n나이: " + age + "\n성별 : " + sex + "\n성격 : " + sk);
	}
	
	public void sungjuk() {
		String name;
		int grade;
		int ban;
		int num;
		char sex;
		double score;
		char record;
		
		System.out.println("이름입력");
		name = sc.next();
		System.out.println("학년입력");
		grade = sc.nextInt();
		System.out.println("반입력");
		ban = sc.nextInt();
		System.out.println("번호입력");
		num = sc.nextInt();
		System.out.println("성별입력(M/F)");
		sex = sc.next().charAt(0);
		System.out.println("성적입력");
		score = sc.nextDouble();
		
		sex = (sex == 'M')? '남':'여';
		
		if(score >= 90) {
			record = 'A';
		}else if(score >= 80 && score < 90) {
			record = 'B';
		}else if(score >= 70 && score < 80) {
			record = 'C';
		}else if(score >= 60 && score < 70) {
			record = 'D';
		}else record = 'F';
		
		System.out.println(grade + "학년 " + ban + "반 " + num + "번 " + sex + "학생 "
				+ name + "의 점수는 " + score + "이고, " + record + "학점입니다.");
	}
	
	public void printStarNumber() {
		System.out.println("정수입력");
		int a = sc.nextInt();
		if(a > 0) {
			for(int i=0; i<a; i++) {
				for(int j=0; j<=i; j++) {
					if(i!=j) {
					System.out.print("*");
					}else
						System.out.print(i+1);
				}System.out.println();
			}
		}else 
			System.out.println("양수가 아닙니다.");
	}
	public void sumRandomNumber() {
		int num = (int)(Math.random()*100)+1;
		int res = 0;
		for(int i=1; i<=num; i++) {
				res += i;
		}
		System.out.println("발생변수 : " + num);
		System.out.println("결과값 : " + res);
	}
	
	public void continueGugudan() {
		System.out.println("정수입력");
		int a = sc.nextInt();
		if(a > 0) {
			for(int i=1; i<10; i++) {
				if(i!=a) {
				System.out.println(a + "*" + i + "=" + a*i);
				}
			}
		}else 
			System.out.println("양수가 아닙니다.");
	}
	
	public void shutNumber() {
		String a;
		do {
			int i = (int)(Math.random()*6)+1;
			int j = (int)(Math.random()*6)+1;
			//System.out.println(i+j);
			System.out.println("2~12 정수 입력");
			int num = sc.nextInt();
			
			if(num == i+j) {
				System.out.println("맞췄습니다.");
			}else
				System.out.println("틀렸습니다.");
			
			System.out.println("계속하시겠습니까?(y/n)");
			a = sc.next();
		}while(a.equals("y"));
	}
}
