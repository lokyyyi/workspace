package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {

	public void testArrayList() {
		//ArrayList
		List alist = new ArrayList();
		
		//다형성 적용
		List list = new ArrayList();
		Collection clist = new ArrayList();
		
		alist.add("apple");
		alist.add(123);;
		alist.add(45.67);
		alist.add(new Date());
		
		System.out.println("alist: " + alist);
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(i+" : " +alist.get(i));
		}
		
		alist.add("apple");
		System.out.println("alist: " + alist);
		
		alist.add(1, "banana");
		System.out.println("alist: " + alist);
		
		Collections.sort(list);

		
	}
}
