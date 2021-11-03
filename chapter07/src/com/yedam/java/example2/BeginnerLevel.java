package com.yedam.java.example2;

public class BeginnerLevel extends PlayerLevel {
	
	
	public BeginnerLevel() {
		this.level = "beginner";
	
	}

	@Override
	public void run() {
		System.out.println("달립니다.");
		
	}

	@Override
	public void jump() {
System.out.println("점프할줄 모릅니다.");
		
	}

	@Override
	public void turn() {
System.out.println("턴 할줄 모릅니다.");
		
	}

	@Override
	public void showLevelMessage() {
System.out.println("초보자 레벨입니다.");
		
	}
	
}
