package com.yedam.java.ch01_01;

public class Main {

	public static void main(String[] args) {
		DmbPhone dmb = new DmbPhone("자바폰", "검정",10);
		
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		System.out.println("채널 : " + dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("Hello");
		dmb.sendVoice("반갑습네다");
		dmb.hangUp();
		
		
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.powerOff();
		System.out.println();
		
		System.out.println("=====================================");
		Student student = new Student("홍길동" , "123456-1234567", 2);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		
		
		System.out.println("=====================================");
		int r = 10;
		Calculator cal = new Calculator();
		System.out.println("원 면적 : " + cal.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
		System.out.println("=====================================");

		
		SupersonicAriplane sa = new SupersonicAriplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAriplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAriplane.NORMAL;
		sa.fly();
		sa.land();
		System.out.println();
	}

}
