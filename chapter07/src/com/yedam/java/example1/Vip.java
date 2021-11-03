package com.yedam.java.example1;

public class Vip extends Cus {
	private double salerate; // 할인률
	private int agentId; // 상담원

	public Vip() {
		this.grade = "VIP";
		this.pointrate = 0.05;
		this.salerate = 0.1;
		System.out.println("Vip() 생성자 호출");

		
	}
	
		public int getAgentId() {
		return agentId;
		
	}
		@Override
		public int calcPrice(int price) {
			point += (price * pointrate);
			return price;
		}
		
		public String showVipInfo() {
			return super.showCustromerInfo()+"담당 :" + agentId + "입니다";
		}
		
		
		
}

