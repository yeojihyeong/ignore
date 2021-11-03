package com.yedam.java.example1;

public class VipCus{

	//필드
	private int cusid;//고객 아이디
	private String name;//고객 이름
	private String grade;	//고객 등급
	private int point;	//보너스 등급
	private double pointrate;	//보너스 포인트 적립비율
	private double salerate;	//할인률
	private int agentId;	//상담원
	
	//생성자
	
	public VipCus() {
		this.grade = "VIP";
		this.pointrate = 0.05;
		this.salerate = 0.1;
	}
	//고객 등급 VIP
	//보너스 적립 5%
	//할인율 10%
	
	
	//메소드
	public int calaPrice(int price) {
		point += price * pointrate;
		return price - (int)(price * salerate);
	}
	
	public String showCustromerInfo() {
		return name + "님의 등급은" + grade +"이며, 보너스 포인트는 : "+point + "입니다.";
		
	}
	//문제2) VIP 등급 고객
	//      제품 구입 시 10% 할인
	//      보너스 포인트 5% 적립
	//      담당 전문 상담원을 배정
}
