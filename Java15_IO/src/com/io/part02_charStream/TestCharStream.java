package com.io.part02_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {

	public void fileSave() {

		FileWriter fw = null;
		
		try{
			//1.스트림 생성(통로연결)
			fw = new FileWriter("sample2.txt");
			
			//2.외부자원으로 출력
			fw.write("비가오는 화요일 ");
			fw.write('A');
			fw.write(' ');
			char[] carr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(carr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//3.close()
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {
		FileReader fr = null;
		try {
			//1.스트림 생			
			fr = new FileReader("sample2.txt");
			
			//2. 외부 자원으로 부터 데이터 입력
			int value;
			while((value = fr.read()) != -1) {
				System.out.println((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
