package com.nackademin.arash_bidarian_assignment02;

// import com.nackademin.arash_bidarian_assignment02.BasicCalculator;
import com.nackademin.arash_bidarian_assignment02.AdvancedCalculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		double inputValue = 0.0;
		double num = 0.0;
		double num1 = 0.0;
		double num2 = 0.0;
//		char operator = ' ';

//		BasicCalculator bc = new BasicCalculator();	
//		System.out.println(bc.division(num1, num2));		
//		AdvancedCalculator ac = new AdvancedCalculator();
//		System.out.println(ac.multiplication(0, 0));		

		Scanner inputValue = new Scanner(System.in);

		System.out.println("Choose one of the operations bellow by selecting their signs in parenteces");
		System.out.println(" (A) addition, (B) subtraction, (C) multiplication, (D) division");
		System.out.println("(E)xToPowOfY,(F) mod, (G)square, (H)cube, (I)tenToPowerOf, (J)absValue, (K)invers");

		char functionName = inputValue.next().charAt(0);
////	String functionName = reader.next().charAt(0);
//		BasicCalculator bc = new BasicCalculator();	

		if (functionName >= 'A' && functionName <= 'K') {

			AdvancedCalculator ac = new AdvancedCalculator();

			switch (functionName) {
			case 'A': // (A) addition
				System.out.println(ac.addition(num1, num2));
				break;
			case 'B': // (B) subtraction
				System.out.println(ac.subtraction(num1, num2));
				break;
			case 'C': // (C) multiplication
				System.out.println(ac.multiplication(num1, num2));
				break;
			case 'D': // (D) division
				System.out.println(ac.division(num1, num2));
				break;
			case 'E': // (E)xToPowOfY
				System.out.println(ac.xToPowOfY(num1, num2));
				break;
			case 'F': // (F) mod
				System.out.println(ac.mod(num1, num2));
				break;
			case 'G': // (G)square
				System.out.println(ac.square(num));
				break;
			case 'H': // (H)cube, (I)tenToPowerOf, (J)absValue, (K)invers
				System.out.println(ac.cube(num));
				break;
			case 'I': // (I)tenToPowerOf, (J)absValue, (K)invers
				System.out.println(ac.tenToPowerOf(num));
				break;
			case 'J': // (J)absValue
				System.out.println(ac.absValue(num));
				break;
			case 'K': // (K)invers
				System.out.println(ac.invers(num));
				break;

			}
		} else {
			System.out.println("The Letter does not match the operation. Try again!");
		}
	}

}
