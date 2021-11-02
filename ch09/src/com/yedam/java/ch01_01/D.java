package com.yedam.java.ch01_01;

public class D {
	//로컬 클래스에서 사용 제한
	
	//자바 7 이전
	public void method1(int arg) {
		final int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	
	public void method2(int arg) {
		int localVariable = 2;
		
		//arg = 100;
		//localVariable = 30;
		class Ineer{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
}
