package com.collection.part02_set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.Date;

public class HashSetTest {
	//HashSet
	public void testHashSet() {
		HashSet hset = new HashSet();
		Set hset2 = new HashSet();
		Collection hset3 = new HashSet();
		
		hset.add("java");
		hset.add(123);
		hset.add(45.65);
		hset.add(new Date());
		
		System.out.println("hset: " + hset);
		
		//중복허용 안함
		hset.add("java");
		hset.add(123);
		System.out.println("hset: " + hset);
		
		//저장된 객체를 하나씩 꺼내는 기능이 없음
		Object[] arr = hset.toArray();
		for(Object obj : arr){
			System.out.println(obj);
		}
		
		//Iterator()로 목록 만들어 연속처리
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//삭제
		hset.clear();
		System.out.println("is Empty: " + hset.isEmpty());
		
	}
}