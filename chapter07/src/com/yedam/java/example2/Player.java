package com.yedam.java.example2;

public class Player {
	//필드
	private PlayerLevel level;
	//생성자
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	//메소드
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel leve1) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
	level.go(count);
	}
}
