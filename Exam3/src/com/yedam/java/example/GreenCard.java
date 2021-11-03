package com.yedam.java.example;

public class GreenCard implements Payment {
	private final String name = "GreenCard";	//카드명
	private String grade;						//적립 등급
	private int point;							//적립 포인트
	private double pointRatio;					//포인트 적립율

	public GreenCard() {
		this.grade = "SILVER";
		this.point = 0;
		this.pointRatio = 0.05;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드명 : " + name);
		System.out.println("적용등급 : " + grade);
		System.out.println("할인율 : " );
		System.out.println("포인트 적립율 : " + pointRatio);
		System.out.println("적립 포인트 :" + point);
	}

}
