package com.yedam.java.ch11.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//Date class
		long time = System.currentTimeMillis();
		Date now = new Date(time);
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		//Calendar 클래스
		Calendar now2 = Calendar.getInstance();
//		System.out.println(now2.toString());
		
		int year = now2.get(Calendar.YEAR);
		int month = now2.get(Calendar.MONTH) + 1;
		int day = now2.get(Calendar.DAY_OF_MONTH);
		
		int week = now2.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		int amPm = now2.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else
		{
			strAmPm = "오후";
		}
		
		int hour = now2.get(Calendar.HOUR);
		int minute = now2.get(Calendar.MINUTE);
		int second = now2.get(Calendar.SECOND);
	
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + "");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초");
	}

}
