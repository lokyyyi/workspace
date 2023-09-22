package com.arrayPractice1.sample;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {
		int[] arr = new int[10];
		int count = 0;
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*100) +1;
			count += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
	
	public void test2() {
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		Arrays.sort(arr);
		System.out.println("최댓값 : " + arr[9] + "\n최솟값 : " + arr[0]);
	}
	
	public void test3() {
		byte[] bt = new byte[10];
		int count = 0;
		Random rd = new Random();
		rd.nextBytes(bt);
		System.out.println(Arrays.toString(bt));
		for(int i=0; i<bt.length; i++) {
			if(bt[i]%2 == 0) {
				count = count + bt[i];
			}
		}
		System.out.println(count);
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		String str = sc.nextLine();
		int count = 0;
		int[] arr = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i] = Integer.parseInt(str.substring(i, i+1));
			count += Integer.parseInt(str.substring(i, i+1));
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		
	}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("숫자입력");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			count += str.charAt(i) - 48;
		}
		
		System.out.println(count);
		
	}
}
