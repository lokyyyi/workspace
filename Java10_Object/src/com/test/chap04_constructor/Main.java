package com.test.chap04_constructor;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		User u1 = new User();
		u1.information();
		
		User u2 = new User("user01", "pass01", "주현록");
		u2.information();
		
		User u3 = new User("user02", "pass02", "김현록", new Date());
		u3.information();
	}

}
