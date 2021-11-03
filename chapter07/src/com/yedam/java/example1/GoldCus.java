package com.yedam.java.example1;

public class GoldCus extends Cus {
 // 제품살때 항상 10% 할인
// 보너스 포인트는 2%
	//필드
	private double salerate; // 할인률
	//생성자
	public GoldCus(String name, int cusid) {
		this.grade = "GOLD";
		this.name = name;
		this.cusid = cusid;
		this.pointrate = 0.02;
		this.salerate = 0.1;
	}	
	//메소드
	 // calcPrice
	public int calcPrice(int price) {
		point += point*pointrate;
		return price - (int)(price*salerate);
	}
	
	//showVipInfo()
	public String showCustromerInfo() {
		return name + "님의 등급은" + grade +"이며, 보너스 포인트는 : "+point + "입니다.";
		
	}
	
}
