package com.yedam.java.ch03_01;

public abstract class Phone {

	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void trunOn() {
		System.out.println("폰 전원을 킵니다.");
	}
	public void trunOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
