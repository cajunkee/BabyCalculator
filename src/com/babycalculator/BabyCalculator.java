package com.babycalculator;

import java.util.Scanner;

public class BabyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter in first number: ");
		double num1 = keyboardInput.nextDouble();
		System.out.print("Enter in second number: ");
		double num2 = keyboardInput.nextDouble();
		System.out.println(num1 + num2);
		
	}

}
