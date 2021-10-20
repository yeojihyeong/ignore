package Ch04_01;

import java.io.IOException;
import java.util.Scanner;

public class Ch04_01 {

	public static void main(String[] args) throws IOException {
		int score = 93; 
		
/*
		if ( score >= 90) {
			System.out.println("점수가 90보다 큽니다");
		System.out.println("등급은 A입니다");
		} else  {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다");
		}
		System.out.println("=====================================");
		
		score = 75;
		if ( score >= 90) {
			System.out.println("점수가 90~100점 입니다");
		System.out.println("등급은 A입니다");
		} else if (score >= 80) {
			System.out.println("점수가 80~90점 입니다.");
			System.out.println("등급은 B입니다");
		} else if (score >= 70) {
			System.out.println("점수가 70~80점 입니다.");
			System.out.println("등급은 C입니다");
		}
		else if (score >= 60) {
			System.out.println("점수가 60~70점 입니다.");
			System.out.println("등급은 D입니다");
		}
		else {
			System.out.println("점수가 60점 이하 입니다.");
			System.out.println("등급은 E입니다");
		}
		
		System.out.println("===================================");
		int num = (int)(Math.random()*6) + 1; //랜덤함수 범위 : 0.0~1.0
		if (num ==1)
		{
			System.out.println("1번이 나왔습니다.");
		}
		else if ( num ==2)
		{
			System.out.println("2번이 나왔습니다.");	
		}
		else if ( num ==3)
		{
			System.out.println("3번이 나왔습니다.");	
		}
		else if ( num ==4)
		{
			System.out.println("4번이 나왔습니다.");	
		}
		else if ( num ==5)
		{
			System.out.println("5번이 나왔습니다.");	
		}
		else
		{
			System.out.println("6번이 나왔습니다.");	
		}
		
		System.out.println("=====================================");
		//두개의 정수가 주어졌을때 두 정수의 합이 자연수이면 'Natural Number'을 출력하세요
		/*
		 * int num0 = scanner.nextInt();
		int num9 = scanner.nextInt();
		if ( (num9+num0) >0) {
			System.out.println("Natural Number");
		}
		
		//두개의 정수가 주어졌을 때 두수의 대소관계에 따른 부등호(> , = , <)를 출력하도록 구현하세요.
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		if ( num1 > num2) {
			System.out.println("num > num2");
		} else if(num1 == num2){
			System.out.println("num = num2");
		} else
		{
			System.out.println("num < num2");
		}
		//체질량 지수인 BMI에 따라 비만도에 따라 네가지 단계로 구분하여 결과값을 출력하도록 구현하세요.
		//BMI = 체중 / (키 * 키)   저체중 <18.5, 정상 18.5<= 정상 < 25, 25<= 과체중 <30, 30<= 비만
		double num3 = scanner.nextDouble();
		double num4 = scanner.nextDouble();
		double BMI = num3/ (num4 * num4);
		if (BMI > 30) {
			System.out.println("비만");
		} else if (BMI>=25) {
			System.out.println("과체중");
		}
		 else if (BMI>=18.5) {
				System.out.println("정상");
		} else {
				System.out.println("저체중");
		}
		
		
		*/
		
		Scanner scanner = new Scanner(System.in);

		
		/*
		
		
		
		int num5 = (int)(Math.random() *6 )+1;
		
		switch(num5) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("6");
		}
		
		
		int time = (int)(Math.random()*4 + 8);
		System.out.println("[현재 시간 : " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근을 합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		case 11:
			System.out.println("외근을 나갑니다.");
			break;
		}
		
		
		String char1 = scanner.next();
		
		switch(char1) {
		case "a":
		case "A":
			System.out.println("우수회원");
			break;
		case "b":
		case "B":
			System.out.println("일반회원");
			break;
		default:
		System.out.println("손님");
		break;
		}
		
		String position = "과장";
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
			default :
			System.out.println("300만원");
			break;
		}
		*/
		
		int num = scanner.nextInt();
		switch (num) {
		case 1:
			System.out.println(1 + " * 6 = " + (1*6));
			break;
		case 2:
			System.out.println(2 + " * 6 = " + (2*6));
			break;
		case 3:
			System.out.println(3 + " * 6 = " + (3*6));
			break;
		case 4:
			System.out.println(4 + " * 6 = " + (4*6));
			break;
		case 5:
			System.out.println(5 + " * 6 = " + (5*6));
			break;
		case 6:
			System.out.println(6 + " * 6 = " + (6*6));
			break;
		case 7:
			System.out.println(7 + " * 6 = " + (7*6));
			break;
		case 8:
			System.out.println(8 + " * 6 = " + (8*6));
			break;
		case 9:
			System.out.println(9 + " * 6 = " + (9*6));
			break;
		}
		
		
		
		int num2 = scanner.nextInt();
		num2 = num2 / 10;
		switch (num2) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("E등급");
			break;
		}
	}
	
}


				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
