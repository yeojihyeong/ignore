package com.yedam.java.example;

public class MovieThread extends Thread {
/*
	@Override
	public void run() {
		for(int i  = 0 ; i <3 ; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
		}
	}
	*/
	
	/*
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			if(Thread.interrupted())
				break;
		}
	}
	*/
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			try {Thread.sleep(1000);}catch (InterruptedException e) {}
		}
	}
	
	
}
