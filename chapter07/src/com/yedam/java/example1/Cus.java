package com.yedam.java.example1;


public class Cus { 
// 문제1) 회사에서 고객정보를 가지고 맞춤 서비스를 제공하기 위해 고객관리 프로그램
//		고객정보 : 고객 ID, 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립 비율

	//필드
	protected int cusid; //고객 아이디
	protected String name;  // 고객 이름
	protected String grade; // 고객등급
	protected int point; // 보너스 포인트
	protected double pointrate; //보너스 적립비율
	
	//생성자
	public Cus() {
		this.grade = "Silver";
		this.pointrate = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	public Cus(String name, int cusid){
		this.name = name;
		this.cusid = cusid;
		this.grade = "Silver";
		this.pointrate = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	//기본 등급
	//기본 등급일 경우 보너스 적립비율 1%

	//메소드
	//calcPrice -> 물건을 구입햇을 때 1) 보너스 포인트를 적립 2) 할인율을 적용한 가격을 반환
	public int calcPrice(int price) {
		point += (price * pointrate);
		return price;
	}
	//showCustomerInfo -> 고객이름과 등급, 보너스포인트를 출력하는 메소드	
	public String showCustromerInfo() {
		return name + "님의 등급은" + grade +"이며, 보너스 포인트는 : "+point + "입니다.";
		
	}
	

	
	
	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public double getPointrate() {
		return pointrate;
	}

	public void setPointrate(double pointrate) {
		this.pointrate = pointrate;
	}

	
}
