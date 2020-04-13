package com.nackademin.arash_bidarian_assignment02;

import com.nackademin.arash_bidarian_assignment02.BasicCalculator;
import com.nackademin.arash_bidarian_assignment02.AdvancedOperations;
import java.lang.Math;
import java.util.Scanner;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	// (1) returns num raised to the power of 2
	public double square(double num) {
		System.out.print("Enter number: ");
		Scanner inputValue1 = new Scanner(System.in);
		num = inputValue1.nextDouble();

		return num * num;
	}

	// (2) returns num raised to the power of 3
	public double cube(double num) {
		System.out.print("Enter number: ");
		Scanner inputValue1 = new Scanner(System.in);
		num = inputValue1.nextDouble();
		return Math.pow(num, 3);
	}

	// (3) returns 10 raised to the power of number
	public double tenToPowerOf(double num) {
		System.out.print("Enter number: ");
		Scanner inputValue1 = new Scanner(System.in);
		num = inputValue1.nextDouble();
		return Math.pow(10, num);
	}

	// (4) returns num1 raised to the power of num2
	public double xToPowOfY(double num1, double num2) {
		System.out.print("Enter first number: ");
		Scanner inputValue1 = new Scanner(System.in);
		num1 = inputValue1.nextDouble();

		System.out.print("Enter second number: ");
		Scanner inputValue2 = new Scanner(System.in);
		num2 = inputValue2.nextDouble();
		return Math.pow(num1, num2);
	}

	// (5) returns |number|
	public double absValue(double num) {
		System.out.print("Enter number: ");
		Scanner inputValue1 = new Scanner(System.in);
		num = inputValue1.nextDouble();
		return Math.abs(num);
	}

	// (6) returns 1/num
	public double invers(double num) {
		System.out.print("Enter number: ");
		Scanner inputValue1 = new Scanner(System.in);
		num = inputValue1.nextDouble();
		if (num != 0) {
			return 1 / num;
		} else {
			System.out.println("0 is NOT allowed in denominator!");
			return -0.123456789;

		}
	}

	// (7) returns num1 mod num2
	public double mod(double num1, double num2) {
		System.out.print("Enter first number: ");
		Scanner inputValue1 = new Scanner(System.in);
		num1 = inputValue1.nextDouble();

		System.out.print("Enter second number: ");
		Scanner inputValue2 = new Scanner(System.in);
		num2 = inputValue2.nextDouble();
		if (num2 != 0) {
			return num1 % num2;
		} else {
			System.out.println("0 is allowed in denominator!");
			return -0.123456789;

		}

	}

}
