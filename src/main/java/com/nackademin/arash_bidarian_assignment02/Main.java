package com.nackademin.arash_bidarian_assignment02;

// import com.nackademin.arash_bidarian_assignment02.BasicCalculator;
import com.nackademin.arash_bidarian_assignment02.AdvancedCalculator;
// import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		double inputValue = 0.0;
//		double num = 0.0;
//		double num1 = 0.0;
//		double num2 = 0.0;
//		char operator = ' ';
		
		//========================
		// BAsic Calculator

		BasicCalculator bc = new BasicCalculator();	
		System.out.println(bc.addition(4, 5));
		
		
		BasicCalculator bc1 = new BasicCalculator();	
		System.out.println(bc1.multiplication(20, 100));
		
		
		BasicCalculator bc2 = new BasicCalculator();	
		System.out.println(bc2.division(20, 100));
		
		BasicCalculator bc3 = new BasicCalculator();	
		System.out.println(bc3.division(20, 0));
		
		//======================================
		

		
		// AdvancedCalculator
		//===================
		
		// AC ARV
		AdvancedCalculator ac1 = new AdvancedCalculator();
		System.out.println(ac1.multiplication(4, 5));		
		
		AdvancedCalculator ac2 = new AdvancedCalculator();
		System.out.println(ac2.subtraction(5, 50));	
		
		
		// AC Egna funktione 
		// square, cube, tenToPowerOf, xToPowOfY, absValue, invers, mod

		AdvancedCalculator ac3 = new AdvancedCalculator();
		System.out.println(ac3.square(3));	
		
		AdvancedCalculator ac4 = new AdvancedCalculator();
		System.out.println(ac4.cube(2));	
		
		AdvancedCalculator ac5 = new AdvancedCalculator();
		System.out.println(ac5.xToPowOfY(2, 3));	
		
		AdvancedCalculator ac6 = new AdvancedCalculator();
		System.out.println(ac6.invers(5));	
		
		AdvancedCalculator ac7 = new AdvancedCalculator();
		System.out.println(ac7.invers(0));

		AdvancedCalculator ac8 = new AdvancedCalculator();
		System.out.println(ac8.mod(27, 20));

		
	}

}



//Scanner inputValue = new Scanner(System.in);
//
//System.out.println("Choose one of the operations bellow by selecting their signs in parenteces");
//System.out.println(" (A) addition, (B) subtraction, (C) multiplication, (D) division");
//System.out.println("(E)xToPowOfY,(F) mod, (G)square, (H)cube, (I)tenToPowerOf, (J)absValue, (K)invers");
//
//char functionName = inputValue.next().charAt(0);
//////String functionName = reader.next().charAt(0);
////BasicCalculator bc = new BasicCalculator();	
//
//if (functionName >= 'A' && functionName <= 'K') {
//
//	AdvancedCalculator ac = new AdvancedCalculator();
//
//	switch (functionName) {
//	case 'A': // (A) addition
//		System.out.println(ac.addition(num1, num2));
//		break;
//	case 'B': // (B) subtraction
//		System.out.println(ac.subtraction(num1, num2));
//		break;
//	case 'C': // (C) multiplication
//		System.out.println(ac.multiplication(num1, num2));
//		break;
//	case 'D': // (D) division
//		System.out.println(ac.division(num1, num2));
//		break;
//	case 'E': // (E)xToPowOfY
//		System.out.println(ac.xToPowOfY(num1, num2));
//		break;
//	case 'F': // (F) mod
//		System.out.println(ac.mod(num1, num2));
//		break;
//	case 'G': // (G)square
//		System.out.println(ac.square(num));
//		break;
//	case 'H': // (H)cube, (I)tenToPowerOf, (J)absValue, (K)invers
//		System.out.println(ac.cube(num));
//		break;
//	case 'I': // (I)tenToPowerOf, (J)absValue, (K)invers
//		System.out.println(ac.tenToPowerOf(num));
//		break;
//	case 'J': // (J)absValue
//		System.out.println(ac.absValue(num));
//		break;
//	case 'K': // (K)invers
//		System.out.println(ac.invers(num));
//		break;
//
//	}
//} else {
//	System.out.println("The Letter does not match the operation. Try again!");
//}
