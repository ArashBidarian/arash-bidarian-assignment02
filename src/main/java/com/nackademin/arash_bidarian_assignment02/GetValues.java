package com.nackademin.arash_bidarian_assignment02;
import java.util.Scanner;


public class GetValues {
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	private double num1 = 0.0; 
	private double num2 = 0.0; 
	
	public GetValues(double num1, double num2) {
    System.out.print("Enter first number: ");
    Scanner inputValue1 = new Scanner(System.in);
    num1 = inputValue1.nextDouble();
    
    System.out.print("Enter second number: ");
    Scanner inputValue2 = new Scanner(System.in);
    num2 = inputValue2.nextDouble();

	}
	
}
