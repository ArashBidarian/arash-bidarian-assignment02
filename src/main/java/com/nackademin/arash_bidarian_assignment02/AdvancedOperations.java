package com.nackademin.arash_bidarian_assignment02;

public interface AdvancedOperations{
	
	//square = x^2, x^3, 10^x, x^y, absolute value|x|, 1/x)
	
	
	
	
	//(1) returns num raised to the power of 2
	public double square(double num);
	
	//(2) returns num raised to the power of 3
	public double cube(double num);
	
	//(3) returns 10 raised to the power of number
	public double tenToPowerOf(double num);			

	//(4) returns num1 raised to the power of number 
	public double xToPowOfY(double num1, double num2);
	
	//(5) returns |number|
	public double absValue(double num);
		
	//(6) returns 1/num
	public double invers(double num);
	
	//(7) returns num1 mod num2
	public double mod(double num1, double num2);
	
	
}
