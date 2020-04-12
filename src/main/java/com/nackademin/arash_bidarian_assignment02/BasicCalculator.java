package com.nackademin.arash_bidarian_assignment02;
import com.nackademin.arash_bidarian_assignment02.BasicOperations;

public class BasicCalculator implements BasicOperations{

	public double addition(double num1, double num2) {
		return num1 + num2;
	}

	public double subtraction(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplication(double num1, double num2) {
		return num1 * num2;	}

	public double division(double num1, double num2) {
		if (num2 != 0) {
			return num1/num2;
		}
		else {
			System.out.println("0 is NOT allowed in denominator!");
		return -0.123456789;
		}	
		
	}

	
	
	
	
	
}
