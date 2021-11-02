package com.yedam.java.ch02;

public class Example {

	public static void main(String[] args) {
		// 일반 예외 처리
		try {
			Class clazz = Class.forName("java.langa.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");

		}

		// 실행 예외 처리
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값이 부족합니다ㅏㅏㅏㅏ");
		}
		System.out.println();
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println();

		// 다중 catch
		try {
			data1 = args[0];
			data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값이 부족합니다ㅏㅏㅏㅏ");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println();
		//chtch 블록의 순서
		
		try {
		//	data1 = args[0];
		//	data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값이 부족합니다ㅏㅏㅏㅏ!");
		}catch(Exception e) {
			System.out.println("실행 문제가 없습니다 ㅏㅏㅏㅏ");
		}finally {
			System.out.println("다시 실행하세요.");
		}
		try {
		finalClass();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		//예외처리 떠넘기기
		public static void finalClass() throws ClassNotFoundException {
			Class clazz = Class.forName("java.lang.String2");
		}
	}

