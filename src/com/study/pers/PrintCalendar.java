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
	 * ��ӡ�·�
	 */
	public static void printMonth(int nYear, int nMonth){
		//System.out.print(nMonth + " " + nYear);
		printMonthTitle(nYear, nMonth);
		printMonthBody(nYear, nMonth);
	}
	
	/**
	 * ��ӡ�·ݵ�����
	 */
	public static void printMonthTitle(int nYear, int nMonth){
		System.out.println("	" + getMonthName(nMonth) + "	" + nYear);
		System.out.println("----------------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	/**
	 * ��ӡ�·���
	 */
	public static void printMonthBody(int nYear, int nMonth){
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
		}
	}
	
	/**
	 * ��ȡ�·ݵ�����
	 */
	public static String getMonthName(int nMonth){
		return "January";
	}
	
	/**
	 * ��ȡһ���¿�ʼ������
	 */
	public static int getStartDay(int nYear, int nMonth){
		return 1;
	}
	
	/**
	 * ��ȡĳ��ʱ�䵽����������������
	 */
	public static int getTotalNumberOfDays(int nYear, int nMonth){
		return 10000;
	}
	
	/**
	 * ��ø��·ݵ�������
	 */
	public static int getNumberOfDaysInMonth(int nYear, int nMonth){
		return 31;
	}
	
	/**
	 * �Ƿ�������
	 */
	public static boolean isLeap(int nYear){
		return false;
	}
}
