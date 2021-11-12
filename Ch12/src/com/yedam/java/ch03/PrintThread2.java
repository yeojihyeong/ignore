package com.yedam.java.ch03;

public class PrintThread2 extends Thread {
	
	//interrupt(); 
	
	@Override
	public void run() {
	/*	try {
		while(true) {
		System.out.println("실행 주우우우웅");
		Thread.sleep(1);
		}
		}catch(InterruptedException e) {
			System.out.println("인터럽트 발생");
		}
		
		*/
		
		while(true) {
			System.out.println("실행 주우우우웅");
			if(Thread.interrupted()) { //쓰레드를 종료시클때 사용
				break;
			}
		}	
		System.out.println("자원 정리ㅣㅣ;;;");
		System.out.println("실행 종료;;;;;;");
	}

}
