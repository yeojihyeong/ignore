package com.yedam.java.ch01.object;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		//객체 동등 비교(equals 메소드)
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2는 논리적으로 동등합네다");}
		else {
			System.out.println("obj1 과 obj2는 논리적으로 동등하지 않습니다");}
	
		if(obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3는 논리적으로 동등합네다");}
		else {
			System.out.println("obj1 과 obj3는 논리적으로 동등하지 않습니다");}
	
		System.out.println();
		
		if(obj2.equals(obj3)) {
			System.out.println("obj2 과 obj3는 논리적으로 동등합네다");}
		else {
			System.out.println("obj2 과 obj3는 논리적으로 동등하지 않습니다");}
		System.out.println();
		
		//Key 객체를 식별키로 사용하여 String 값을 저장하는 HashMap 객체를 생성
		HashMap<Key,String> hashMap = new HashMap<Key,String>();	
		//식별키 new key(1)로 "홍길동" 저장
		hashMap.put(new Key(1), "홍길동");
	
		//식별키 new Key(1)로 "홍길동" 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
