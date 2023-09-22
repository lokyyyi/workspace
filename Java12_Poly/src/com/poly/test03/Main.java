package com.poly.test03;

public class Main {
	public static void main(String[] args) {
		Animal ani = new Cat();
		ani.bark();
		ani.eat("참치");
		
		ani = new Dog();
		ani.bark();
		ani.eat("개껌");
		((Dog)ani).bite();
		
		ani = new Eagle();
		((Eagle)ani).fly();
		ani.bark();
		ani.eat("토끼");
		
		Bird b = new Eagle();
		b.fly();
		((Eagle)b).bark();
		
	}

}
