package com.test01;
import java.util.Arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
	ArrayTest02 at = new ArrayTest02();
	at.deepCopy3();

	}
	
	public void shallowCopy() {
		int[] oriArr = {1,2,3,4,5};
		int[] copyArr;
		copyArr = oriArr;
		
		//-------------------
		System.out.println("1.oriArr : ");
		for(int i=0; i<oriArr.length; i++) {
			System.out.println(oriArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("2.copyArr : ");
		for(int i=0; i<copyArr.length; i++) {
			System.out.println(copyArr[i] + " ");
		}
		
		System.out.println();
		
	}
	
	public void deepCopy1() {
		
		int[] oriArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.arraycopy(oriArr, 0, copyArr, 0, oriArr.length);
		
		System.out.println(Arrays.toString(copyArr));
		
	}

	public void deepCopy3() {
		

		int[] oriArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		copyArr=oriArr.clone();
		
		System.out.println(Arrays.toString(copyArr));
	}
}
