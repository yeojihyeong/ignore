package com.yedam.java.ch02_02;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i = 1 ; i <= 5; i++) {
			int prolemLocation = car.run();
			
			switch(prolemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frountLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 HankookTire로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 HankookTire로 교체");
				car.backRightTire = new HankookTire("뒤오른쪽",17);
				break;
			}
		}
	}

}
