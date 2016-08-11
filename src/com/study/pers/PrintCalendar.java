package com.study.pers;

import java.util.Scanner;

public class PrintCalendar {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter full year (e.g., 2001): ");
		int nYear = input.nextInt();
		
		System.out.print("Enter month as number between 1 and 12: ");
		int nMonth = input.nextInt();
		
		printMonth(nYear, nMonth);
	}
	
	/**
	 * 打印月份
	 */
	public static void printMonth(int nYear, int nMonth){
		//System.out.print(nMonth + " " + nYear);
		printMonthTitle(nYear, nMonth);
		printMonthBody(nYear, nMonth);
	}
	
	/**
	 * 打印月份的名字
	 */
	public static void printMonthTitle(int nYear, int nMonth){
		System.out.println("	" + getMonthName(nMonth) + "	" + nYear);
		System.out.println("----------------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	/**
	 * 打印月份体
	 */
	public static void printMonthBody(int nYear, int nMonth){
		int nStartDay = getStartDay(nYear, nMonth);
		int nNumberOfDaysInMonth = getNumberOfDaysInMonth(nYear, nMonth);
		
		int i = 0;
		for(i = 0; i < nStartDay; ++i)
			System.out.print("	");
		
		for(i = 1; i <= nNumberOfDaysInMonth; ++i){
			System.out.printf("%4d", i);
			if(0 == (i + nStartDay) % 7)
				System.out.println();
		}
	}
	
	/**
	 * 获取月份的名字
	 */
	public static String getMonthName(int nMonth){
		String strMonthName = "";
		switch(nMonth){
		case 1:
			strMonthName = "January";
			break;
		case 2:
			strMonthName = "February";
			break;
		case 3:
			strMonthName = "March";
			break;
		case 4:
			strMonthName = "April";
			break;
		case 5:
			strMonthName = "May";
			break;
		case 6:
			strMonthName = "June";
			break;
		case 7:
			strMonthName = "July";
			break;
		case 8:
			strMonthName = "August";
			break;
		case 9:
			strMonthName = "September";
			break;
		case 10:
			strMonthName = "October";
			break;
		case 11:
			strMonthName = "November";
			break;
		case 12:
			strMonthName = "December";
		}
		return strMonthName;
	}
	
	/**
	 * 获取一个月开始的日子
	 */
	public static int getStartDay(int nYear, int nMonth){
		final int START_DAY_FOR_JAN_1_1800 = 3;
		int nTotalNumberOfDays = getTotalNumberOfDays(nYear, nMonth);
		return (nTotalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}
	
	/**
	 * 获取某个时间到现在所隔的总天数
	 */
	public static int getTotalNumberOfDays(int nYear, int nMonth){
		int nTotal = 0;
		for(int i = 1800; i < nYear; ++i)
			if(isLeapYear(i))
				nTotal += 366;
			else
				nTotal += 365;
		
		for(int i = 1; i < nMonth; ++i)
			nTotal += getNumberOfDaysInMonth(nYear, i);
		
		return nTotal;
	}
	
	/**
	 * 获得该月份的总天数
	 */
	public static int getNumberOfDaysInMonth(int nYear, int nMonth){
		if(1 == nMonth || 3 == nMonth || 5 == nMonth || 7 == nMonth || 8 == nMonth || 10 == nMonth || 12 == nMonth)
			return 31;
		if(4 == nMonth || 6 == nMonth || 9 == nMonth || 11 == nMonth)
			return 30;
		if(2 == nMonth)
			return isLeapYear(nYear) ? 29 : 28;
		return 0;
	}
	
	/**
	 * 是否是闰年
	 */
	public static boolean isLeapYear(int nYear){
		return (0 == nYear % 400 || (0 == nYear % 4 && 0 != nYear % 100));
	}
}
