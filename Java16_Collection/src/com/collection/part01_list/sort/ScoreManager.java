package com.collection.part01_list.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ScoreManager {
	public static void main(String[] args) {
		List<Score> list = new ArrayList<Score>();
		list.add(new Score("이창진", 99));
		list.add(new Score("남승주", 75));
		list.add(new Score("이예담", 88));
		list.add(new Score("안해림", 32));
		list.add(new Score("김나현", 72));
		list.add(new Score("박소정", 61));
		
				
		System.out.println("list: " + list);
		//정렬
		//Comparable - 기본 정렬 기준을 구현, 기본적으로 적용되는 정렬기준
		
		list.sort(null);
		System.out.println("list: " + list);
		
		list.sort(new ScoreDesc());
		System.out.println("list: " + list);
		
		
		Collections.sort(list, new ScoreAsc());
		System.out.println("list: " + list);
		
	}

}
