package com.yedam.java.ch01_01;

public class SportsCar extends Car {

	@Override
	void speedUp() {
		super.speedUp();
	}
	
/*	void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
*/ //파이널 클래스여서 상속 불가능
}
