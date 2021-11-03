package com.yedam.java.ch03_01;

public class Main {

	public static void main(String[] args) {
		//Phone phone = new Phone("홍길동");
		
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		smartphone.trunOn();
		smartphone.internetSearch();
		smartphone.trunOff();
		
	}

}
