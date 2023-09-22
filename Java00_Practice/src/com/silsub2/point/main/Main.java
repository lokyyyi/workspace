package com.silsub2.point.main;

import com.silsub2.point.model.vo.Point;
import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {
	
	public static void main(String[] args) {
		Point c1 = new Circle(1, 2, 3);
		Point c2 = new Circle(4, 5, 6);
		Point c3 = new Circle(2, 4, 3);
		
		Point []arr1 = {c1, c2, c3};
		
		Point r1 = new Rectangle(1, 2, 3, 4);
		Point r2 = new Rectangle(2, 3, 4, 5);
		Point r3 = new Rectangle(9, 8, 7, 6);
		
		Point []arr2 = {r1, r2, r3};
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("[" + (i+1) + "번째 원]");
			arr1[i].draw();
		}
		
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println("[" + (i+1) + "번째 직사각형]");
			arr2[i].draw();
		}
	}

}
