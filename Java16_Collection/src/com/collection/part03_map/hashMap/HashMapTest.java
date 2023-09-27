package com.collection.part03_map.hashMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public void testHashMap() {
		HashMap hmap = new HashMap();
		
		// key and value
		// kew, value 둘다 반드시 객체.
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33, 123);
		
		System.out.println("hmap: " + hmap);
		
		//key는 중복 저장 안됌
		hmap.put(12, "school");
		System.out.println("hmap: " + hmap);
		
		
		hmap.put(11, "school");
		hmap.put(9, "school");
		System.out.println("hmap: " + hmap);
		
		//key값으로 객체 가져오기 가능
		//get(key) 
		System.out.println("키 9에 대한 객체: " + hmap.get(9));
		
		//삭제
		hmap.remove(9);
		System.out.println("hmap : " + hmap);
		
		hmap.clear();
		//Map에 저장된 객체 연속 처리
		hmap.put("one", "java 11");
		hmap.put("two", "mysql");
		hmap.put("three", "JDBC");
		hmap.put("four", "HTML5");
		hmap.put("five", "CSS3");
		
		//1. ketSet()
		//key만 set으로 만ㄷ르고 iterator() 사용
		
		Set keys = hmap.keySet();
		
		Iterator keyIter = keys.iterator();
		while(keyIter.hasNext()){
			String key = (String)keyIter.next();
			String value = (String)hmap.get(key);
			System.out.println(key+"="+value);			
		}
		
		//2. entrySet() : map내부 클래스인 Entryghkfdyd
		Set eSet = hmap.entrySet();
		Iterator entryIter = eSet.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIter.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
	
	

}
