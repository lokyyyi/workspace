package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyClient {

	public static void main(String[] args) throws IOException {
		//소켓 생성
		DatagramSocket ds = new DatagramSocket(9999);
		System.out.println("클라이언트");
		
		//데이터를 받을 배열 생성
		byte[] buff = new byte[1024];
		
		DatagramPacket recieveP = new DatagramPacket(buff, buff.length);
		
		//서버에서 send한 packet저장
		ds.receive(recieveP);
		
		System.out.println(new String(recieveP.getData()));
		
		//종료
		ds.close();
		ds.disconnect();
	}
}
