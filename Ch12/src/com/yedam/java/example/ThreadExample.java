package com.yedam.java.example;

public class ThreadExample {

	public static void main(String[] args) {

		/*
		 * Thread thread1 = new MovieThread(); thread1.start();
		 * 
		 * Thread thread2 = new Thread(new MusicRunnable()); thread2.start();
		 * 
		 */
		
		
		/*
		Thread thread = new MovieThread();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		thread.interrupt();
*/	
	
	Thread thread1 = new MovieThread();
	thread1.setDaemon(true);
	thread1.start();
	
	try {Thread.sleep(1000);} catch(InterruptedException e) {}
	}
}
