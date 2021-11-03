package com.yedam.java.example2;

public class AdvancedLevel extends PlayerLevel {

	public AdvancedLevel() {
		this.level = "advanced";
	
	}

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
		
	}

	@Override
	public void jump() {
System.out.println("점프합니다.");		// TODO Auto-generated method stub
		
	}

	@Override
	public void turn() {
System.out.println("턴 할줄 모릅니다.");
		
	}

	@Override
	public void showLevelMessage() {
System.out.println("중급자 레벨 입니다.");		// TODO Auto-generated method stub
		
	}

	

}
