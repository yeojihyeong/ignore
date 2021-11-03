package com.yedam.java.ch05.stringtoken;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// String.split() : 정규표현식 
		// StringTokenizer: 문자
		// 공통점 : 문자열이 특정부분자로 있어 특정 부분자로 분리할수잇을때 ex) 특수문자
		// 010-123-1234 : -, 010  123  1234 => 문자열로 분리
	
		String text1 = "홍길동&이수홍,박연수,김자바-최영호";
		
		String[] names = text1.split("&|,|-"); //-> & or , or - 에 도달할때 마다 하나의 String으로 자르기.
		for(String name : names) {
			System.out.println(name);
		}
		
		String text2 = "홍길동/이수호/박연수";
		StringTokenizer st = new StringTokenizer(text2, "/");
		// st : 문자열을 담고있는 스택
		// 홍길동
		// 이수호
		// 박연수
		int countTokens = st.countTokens();
		System.out.println("현재 토큰 수 : " +countTokens);
		for(int i = 0 ; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token + ", " + st.countTokens());
		}
		System.out.println();
		
		st = new StringTokenizer(text2, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		
		//StringBuilder : 새로운 문자열을 생성하지 않고 문자열을 변경하는 경우에 사용하며, 내부 버퍼를 별도로 가지고 있어 그 안에 문자열을 저장해두고, 추가, 수정, 삭제 작업을 할 수 있다.
		
		StringBuilder sb = new StringBuilder();
		
		//문자열 추가 -> 기존의 값 이후에 추가
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		
		//index 4번째 앞에 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		//4번째 순서에 문자 6 대체
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//index 6 ~ 13 까지를 Book으로 대체
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		//index 4~5 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자수 : " +length);
		
		String result = sb.toString();
		System.out.println(result);
		
		
		String regExp = "(053|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
			
		boolean resultData = Pattern.matches(regExp, data);
		if (resultData) {
			System.out.println("정규표헌식과 일치합니다.");	
		}
		else {
			System.out.println("정규표현식과 일치하지 않습니다");
		}
		
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "yeo1234@navercom";
		resultData = Pattern.matches(regExp, data);
		if (resultData) {
			System.out.println("정규표헌식과 일치합니다.");	
		}
		else {
			System.out.println("정규표현식과 일치하지 않습니다");
		}
		
		
	}

}
