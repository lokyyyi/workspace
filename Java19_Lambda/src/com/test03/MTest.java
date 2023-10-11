package com.test03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MTest {

	public static void main(String[] args) {
		//createStream();
		//createCollection();
		pipeline();
		
	}
	
	public static void createStream() {
		Stream<String> stream01 = Stream.<String>builder().add("홍길동").add("이순신")
				.add("주현록").build();
		
		stream01.forEach(System.out::println);
		
		//empty() : 비어 있는 스트림 생성
		Stream<String> stream02 = Stream.empty();
		System.out.println(stream02.toArray().length);
		
		//generate(람다식) : Supplier<T>에 해당하는 람다식을 넣을 수 있다.
		//Supplier는 매개변수X리턴값만 있는 함수형 인터페이스.
		Stream<Integer> stream03 = Stream.generate(() -> 100).limit(3);
		stream03.forEach(System.out::println);
		
		//iterate : 초기값과 해당 값을 다루는 람다식을 이용해서 스트림에 들어갈 요소 생성.
		Stream<Integer> stream04 = Stream.iterate(1, (i) -> ++i).limit(5);
		stream04.forEach(System.out::println);
		
		IntStream range01 = IntStream.range(1, 5);
		range01.forEachOrdered((i) -> System.out.print(i+ " "));
		System.out.println();
	}
	
	public static void createCollection() {
		String[] arr = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		Stream<String> stream01 = Arrays.stream(arr);
		stream01.forEach(System.out::println);
		
		//List<String> list = Arrays.asList(arr);
		List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		System.out.println(list);
	}
	
	public static void pipeline() {
		//filter : 스트림에서 뽑아져 나오는 데이터 중에서 특정 데이터만 골라내는 역할
		//filter는 boolean을 리턴하는 람다식을 넣는다.
		//collect() : Stream을 다시 Collection으로 반환해주는 기능.
		//collect의 매개변수로 Collectors클래스가 제공하는 메소드 이용.
		
		List<String> web28 = Arrays.asList("안해림", "주현록", "이진기", "이예담", "송제영","김송현","이담");
		List<String> song = web28.stream()
				.filter(name -> name.contains("송"))
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(song);
		
		//이름이 2글자 인 사람만 확인
		List<String> two = 
				web28.stream()
				.filter(name -> name.length() == 2)
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(two);
		
		web28.stream()
		.filter(name -> name.contains("송"))
		.sorted()
		.map(w -> w.replace(w.substring(1,w.length()), "*".repeat(w.length()-1)))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		List<Integer> lotto = 
				Stream.generate(() -> (int)(Math.random()*45)+1)
				.distinct()
				.limit(6)
				.sorted()
				.collect(Collectors.toList());
		
		lotto.stream().forEachOrdered((i) -> System.out.print(i+" "));
		
	}
}
