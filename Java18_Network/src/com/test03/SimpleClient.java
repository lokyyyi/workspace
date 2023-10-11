package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) {
		//준비
		Socket clientSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("server에 접속합니다...");
		
		try {						
			//소켓 생성. 서버로
			clientSocket = new Socket("localhost", 9999);
			
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			String inputLine;
			while((inputLine = sc.nextLine())!= null) {
				out.println(inputLine);
				System.out.println("server로 부터 다시 받은 메시지 : " + in.readLine());
			}
			
			sc.close();
			in.close();
			out.close();
			clientSocket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
