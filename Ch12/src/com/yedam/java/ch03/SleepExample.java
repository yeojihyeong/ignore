package com.yedam.java.ch03;

public class SleepExample {
	public static void main(String[] args) {
		//StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		//statePrintThread.start();
		
		
		//stop 플래그
		/*
		PrintThread1 printThread = new PrintThread1();
		
		printThread.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		printThread.setStop(true);
		
		//interrupt();
		
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		thread.interrupt();
		*/
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
	System.out.println("메인 스레드 종료");	
	}
}
