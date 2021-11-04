package com.yedam.java.ch07.random;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.println("선백 번호: " );
		for(int i = 0; i<6 ; i++) {
			selectNumber[i] = random.nextInt(45) +1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		
		
		
		
		//당첨번호
		int[] winngNumber = new int[6];
		random = new Random();
		System.out.println("당첨 번호: " );
		for(int i = 0; i<6 ; i++) {
			winngNumber[i] = random.nextInt(45) +1;
			System.out.print(winngNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winngNumber);
		boolean result = Arrays.equals(selectNumber, winngNumber);
		if(result) {
			System.out.println("1등당첨");
		}else {
			System.out.println("꽝");
		}
	}

}
