package com.peng.pers;

import java.util.Scanner;

public class Exercise2_5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double dSubtotal = input.nextDouble();
		double dGratuity = input.nextDouble();
		double dExtra = dSubtotal * dGratuity / 100;
		double dTotal = dExtra + dSubtotal;
		System.out.print("The gratuity is " + dExtra + " and total is " + dTotal);
	}
}
