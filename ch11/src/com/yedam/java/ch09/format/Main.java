package com.yedam.java.ch09.format;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date(); //현재시점으로 날짜와 시간을 가져옴.
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd"); // mm -> 분
	System.out.println(sdf.format(now));
	 sdf = new SimpleDateFormat("yyyy-MM-dd"); //MM -> 월
	 System.out.println(sdf.format(now));
	 System.out.println(now.toString());
	 
	 sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
	 System.out.println(sdf.format(now));
	 
	 System.out.println();
	 String id = "java";
	 String name = "신용권";
	 String tel = "010-123-1234";
	 //회원 id : java  \n 회원이름 : 신용권 \n 회으ㅓㄴ전화 : 010-123-1234
	 String text = "회원 id : {0} \n회원이름 : {1} \n회원전화 : {2}"; 
	 String result1 = MessageFormat.format(text, id,name,tel);
	 System.out.println(result1);
	 System.out.println();
	 
	 String sql = "insert into member values({0},{1},{2})";
	 String result2 =MessageFormat.format(sql, id,name,tel);
	 System.out.println(result2);
	 System.out.println();
	 
			 }

}
