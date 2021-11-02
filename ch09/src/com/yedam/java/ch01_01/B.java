package com.yedam.java.ch01_01;

public class B {
	//바깥 필드와메소드에서 사용제한
	//인스턴스 필드
	X flied1 = new X();
	Y filed2 = new Y();
	
	//정적 필드
	//static X filed3 = new X(); 불가능 
	static Y filed4 = new Y();
	
	
	//인스턴스 메소드
	void method1() {
		X var1 = new X();
		Y var2 = new Y();
	}
	
	//인스턴스 정적 메소드
	static void method2() {
		// X var3 = new X(); 생성 불가
		Y var4 = new Y();
	}
	
	//인스턴스 멤버 클래스
	class X{}
	
	//정적 멤버 클래스
	
	static class Y{}
}
