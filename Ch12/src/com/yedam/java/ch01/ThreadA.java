package com.yedam.java.ch01;

public class ThreadA extends Thread {

	public ThreadA() {
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		for(int i = 0; i <2 ; i++) {
			System.out.println(getName() + "출력한 내용");
		}
	}
	
	
}
