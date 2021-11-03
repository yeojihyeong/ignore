package com.yedam.java.example2;

public abstract class PlayerLevel {
	//필드
	public String level; //레벨
	
	
	public abstract void run(); //run
	public abstract void jump(); //jump
	public abstract void turn();	//turn
	
	public abstract void showLevelMessage(); //show메세지 출력
	final public void go(int count) { //필살기
		run();
		for(int i = 0 ; i <= count ; i++) {
			jump();
		}
		turn();
	}

	public void go() {
		// TODO Auto-generated method stub
		
	}
	
	
}
