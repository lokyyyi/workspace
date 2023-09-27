package com.io.part01.byteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestByteStream {

	//Byte단위의 기반 스트림 FileOutputStream, FileInputStream
	
	public void fileSave() {
		//출력
		FileOutputStream fout = null;
		
		//객체 생성 = 스트림생성 = 통로연결
		
		try {
			fout = new FileOutputStream("sample.txt");
			
			//data 출력
			fout.write(97);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				//스트림 닫기
				fout.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {
		//입력
		
		//스트림 생성
		//try with resource
		//반드시 close() 처리를 해야 하는 객체 생성 구문을
		//자동으로 close()됨.
		
		try(FileInputStream fin = new FileInputStream("sample.txt")){
			
			int val;
			while((val=fin.read())!= -1) {
				System.out.print(val+" ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
	}
}
