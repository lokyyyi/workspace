package com.io.fileTest;

import java.io.File;

import java.io.IOException;

public class Filetest {

	public static void main(String[] args) {
		//File class
		File file = new File("Person.txt");
		System.out.println("파일명: " + file.getName());
		System.out.println("저장경로: " + file.getAbsolutePath());
		System.out.println("파일용량: " + file.length());
		
		try {
			//파일이 업슨ㄴ경우 파일 생성(true), 파일 있는경우 (false)
			boolean b = file.createNewFile();
			
			System.out.println(b);
			
			boolean b1 = file.delete();
			
			System.out.println(b1);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
