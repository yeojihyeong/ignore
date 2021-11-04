package com.yedam.java.ch03;

public class Main {

	public static void main(String[] args) {
		// 제한된 타입 파라미터 : <T extends 최상위 타입>

		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
		
		//int result3 = Util.compare("a", "b");
		
		// 제한된 타입ㅁ 파라미터 : <T super 하위 클래스>
		
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("Smart Tv");
		product.setCompany("Samsung");
		
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
	}

}
