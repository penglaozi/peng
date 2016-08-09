package com.peng.pers;
/**
 * 
 * @author peng
 *
 */

import java.util.Scanner;

public class Exercise2_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double dFeet = input.nextDouble();
		double dMeter = dFeet * 0.305;
		System.out.println(dFeet + " feet is " + dMeter + " meters");
	}
}
