package com.yedam.java.example2;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		System.out.println();
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		System.out.println();
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		System.out.println();
		
	}

}
