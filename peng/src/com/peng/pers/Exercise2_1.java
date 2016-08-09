package com.peng.pers;

import java.util.Scanner;

public class Exercise2_1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a celsius data:");
		double dCelsius = input.nextDouble();
		double dFahrenheit = (9.0/5) * dCelsius + 32;
		System.out.println(dCelsius + " Celsius is " + dFahrenheit + " Fahrenheit");
	}
}
