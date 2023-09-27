package com.io.part03_addStream.chap01_buffer.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream {
	//보조 스트림 클래스 단독으로 객체생성 불가능(단독으로 스트림 생성 불가능)
	
	public void outputBufferStream() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("sample3.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("안녕하세요\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void inputBufferStream() {
		BufferedReader br = null;
		
		//new 보조스트림(new 기반스트림("외부자원"));
		try {
			br = new BufferedReader(new FileReader("sample3.txt"));
			
			String temp = null;
			while((temp=br.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void inOutBufferStream() {
		
	}
}
