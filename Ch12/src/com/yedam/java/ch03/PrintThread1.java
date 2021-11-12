package com.yedam.java.ch03;

public class PrintThread1 extends Thread {
	//stop 플래그를 이용한 방법
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
	}
}
