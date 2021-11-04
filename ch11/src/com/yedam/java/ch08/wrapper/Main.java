package com.yedam.java.ch08.wrapper;

public class Main {

	public static void main(String[] args) {
		//박싱 : 기본 타입의 값을 포장객체로 만드는 과정
		//언박싱  : 포장 객체에서 기본 타입의 값을 얻어내는 과정
		
		//박싱
		//Integer obj1 = new Integer(100);
		//Integer obj2 = new Integer("200"); //문자열 가능
		Integer obj4 = Integer.valueOf("200");
		
		//자동 박싱
		Integer obj3 = 100;
		
				
		//언박싱
		int value3 = obj3.intValue();
		
		//자동 언박싱
		int value4 = obj4;
		int result = obj3+100;
		
		
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(result);
		System.out.println();
		
		//문자열을 기본 타입으로 변환
		
		
		int val1 = Integer.parseInt("010110");
		double val2 = Double.parseDouble("3.1415");
		boolean val3 = Boolean.parseBoolean("true");
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println();
		//포장객체 비교
		Integer obj7 = 300;
		Integer obj8 = 300;
		System.out.println("====결과 : " + obj7==obj8 + "=======");
		System.out.println("언박싱 후 == 결과 " + (obj7.intValue() == obj8.intValue()));
		System.out.println("equals() 결과 " + obj7.equals(obj8));
		System.out.println();
		
		Integer obj9 = 10;
		Integer obj10 = 10;
		System.out.println("====결과 : " + (obj9==obj10) + "=======");
		System.out.println("언박싱 후 == 결과 " + (obj9.intValue() == obj10.intValue()));
		System.out.println("equals() 결과 " + obj9.equals(obj10));
		System.out.println();
		
		
		
		
	}

}
