package com.yedam.java.example2;

public class SuperLevel extends PlayerLevel {

	public SuperLevel() {
		this.level = "super";
	
	}

	@Override
	public void run() {
		System.out.println("어마무시하게 빨리 달립니다");// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
System.out.println("높게 점프 합니다");		// TODO Auto-generated method stub
		
	}

	@Override
	public void turn() {
System.out.println("턴 합니다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("고급자 레벨입니다");
		
	}

		
}

