package com.yedam.java.example1;

public class Main {

	public static void main(String[] args) {

		//일반고객 1명, VIP고객 1명
		Cus c1 = new Cus();
		c1.setName("이순신");
		c1.setCusid(10010);
		c1.point = 1000;
		System.out.println(c1.showCustromerInfo());
		System.out.println();
		
		Vip v1 = new Vip();
		v1.setName("김유신");
		v1.setCusid(10020);
		v1.point = 10000;
		System.out.println(v1.showCustromerInfo());
		System.out.println();
		
		
		int price;
		
		Cus[] cusList = new Cus[5];
		cusList[0] = new Cus("이순신",10010);
		cusList[1] = new Cus("홍길동",10011);
		cusList[2] = new GoldCus("신사임당",10030);
		cusList[2] = new GoldCus("권율",10031);
		
		System.out.println("==========================================================");
		for(Cus cus : cusList) {
			System.out.println(cus.showCustromerInfo());
		}
		
		System.out.println("===========할인율과 보너스 포인트 계산 =====");
		price = 10000;
		for(Cus cus : cusList) {
			int cost = cus.calcPrice(price);
			System.out.println(cus.getName()+"님이"+cost + "원 지불했습니다.");
			System.out.println("현재보너스 포인트는 " + cus.getPoint()+"점 입니다.");
		}
	}

}
