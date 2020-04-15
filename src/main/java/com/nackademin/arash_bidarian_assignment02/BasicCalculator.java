package com.nackademin.arash_bidarian_assignment02;

// import java.util.Scanner;

import com.nackademin.arash_bidarian_assignment02.BasicOperations;

//Operations: addition, subtraction, multiplication, division
//============================================================

public class BasicCalculator implements BasicOperations {

	public double addition(double num1, double num2) {

		return num1 + num2;

	}

	public double subtraction(double num1, double num2) {

		return num1 - num2;
	}

	public double multiplication(double num1, double num2) {

		return num1 * num2;
	}

	public double division(double num1, double num2) {

		if (num2 != 0)  {
			return num1 / num2;
		} else {
			System.out.println("0 is NOT allowed in denominator!");
			return -0.123456789;
		}

	}

}

//  System.out.print("Enter first number: ");
//  Scanner inputValue1 = new Scanner(System.in);
//  num1 = inputValue1.nextDouble();
//  
//  System.out.print("Enter second number: ");
//  Scanner inputValue2 = new Scanner(System.in);
// num2 = inputValue2.nextDouble();
