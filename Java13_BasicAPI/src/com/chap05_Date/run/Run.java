package com.chap05_Date.run;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Run {
	
	public static void main(String[] args) {
		//1. Date(java.util)
		Date today = new Date();
		System.out.println(today);
		
		Date oriDay = new Date(1000L);
		System.out.println(oriDay);
		//oriDay = new Date(100+19, 9-1, 9);
		//System.out.println(oriday);
		
		//원하는 패턴으로 날짜 출력 - simpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(today));
		
		//2. Calendar(java.util)
		
		//ctrl+d 한줄삭제
		//alt + 방향키 위 or 아래
		//ctrl+alt+방향키 위 or 아래

		System.out.println("----Calender----");
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		calendar.set(2023, 10-1,3);
		System.out.println(calendar);
		
		int year = calendar.get(1);
		//int month = calendar.get(2)+1;
		int day = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println(year + "년 ");
		System.out.println(month + "월 ");
		System.out.println(day + "일 ");
		
		Calendar cal = (Calendar)calendar.clone();
		cal.add(Calendar.YEAR, -9);
		cal.add(calendar.MONTH, -4);
		cal.add(calendar.DATE, 10);
		System.out.println(cal.getTime());
		System.out.println(sdf.format(cal.getTime()));
		
		
		//3. GregofianCalender(java.util)
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year : " + gc.get(GregorianCalendar.YEAR));
		System.out.println(gc.get(Calendar.DATE));
		
		gc.set(2024,4-1, 22);
		System.out.println(gc.getTime());
		
		System.out.println(new GregorianCalendar().isLeapYear(2024));
		
	}

}
