package com.test.chap01_encapsulation;

public class Main {

	public static void main(String[] args) {

		//객채생성
		Account a = new Account();
		Account b = new Account();
		
		//잔액조회
		a.prnBalance();
		
		//입금
		
		a.in(10000);
		a.prnBalance();
		
		a.in(15000);
		a.prnBalance();

		//출금
		a.out(5000);
		a.prnBalance();
		

		//
		b.prnBalance();
		//
	
	}

}
