package com.silsub1.model;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {
	int count = 0;
	int sum = 0;
	public void munjae1() {
		int[][] arr = new int[4][4];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = (int)(Math.random()*100)+1;
				count += arr[i][j];
			}
			arr[i][3] = count;
			sum += arr[i][3];
			count = 0;
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				count += arr[j][i];
			}
			arr[3][i] = count;
			sum += arr[3][i];
			count = 0;
		}
		arr[3][3] = sum;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void munjae2() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		for(int i=0; i<3; i++) {
			System.out.println("열 입력");
			arr[i] = new int[sc.nextInt()];
			System.out.println(arr[i].length + " 열 입력");
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*100) +1;
				count += arr[i][j];
			}
			if(count % 5 == 0) {
				System.out.println(i+1 + " 행의 값 =" + count);
				count = 0;
			}
			count = 0;
		}
		
		//배열 확인문
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void munjae3(){
		int iarr[][] = new int[3][];
		Scanner sc = new Scanner(System.in);
		
		int[] sum = new int[iarr.length];
		
		for(int i = 0; i < iarr.length; i++){
			System.out.print(i + "번째 1차원배열 첨자수 : ");
			iarr[i] = new int[sc.nextInt()];
			//값 기록
			for(int j = 0; j < iarr[i].length; j++){
				iarr[i][j] = (int)(Math.random() * 100) + 1;
				sum[i] += iarr[i][j];
			}
		}
		//출력확인
		for(int i = 0; i < iarr.length; i++){
			for(int j = 0; j < iarr[i].length; j++){
				System.out.print(iarr[i][j] + ", ");
			}
			System.out.println();
		}
		//각 행별 합계가 5의 배수인 행만 출력
		for(int i = 0; i < sum.length; i++){
			if(sum[i] % 5 == 0){
				System.out.print(i + "행 : ");
				for(int j = 0; j < iarr[i].length; j++)
					System.out.print(iarr[i][j] + ", ");
				System.out.println("\t합계 : " + sum[i]);
			}
		}
	}
}
