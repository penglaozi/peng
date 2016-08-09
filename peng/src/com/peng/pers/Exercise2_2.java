package com.peng.pers;

import java.util.Scanner;

public class Exercise2_2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		double dRadius = input.nextDouble();
		double dLength = input.nextDouble();
		final double PI = 3.14159265358;
		double dArea = dRadius * dRadius * PI;
		double dVolume = dArea * dLength;
		System.out.println("The area is " + dArea);
		System.out.println("The volume is " + dVolume);	
	}
}
