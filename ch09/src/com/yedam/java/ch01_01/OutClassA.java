package com.yedam.java.ch01_01;

public class OutClassA {

	//필드
	private int num = 10;
	private static int sNum = 20;
	
	private InClassA inClassA;
	
	
	//생성자
	public OutClassA() {	
		inClassA = new InClassA();
	}
	//메소드
	public void usingClass() {
		System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
		System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
	}
	}
	
	class InClassA{
		int inNum = 100;
		
		void intest() {
			
	}
}
