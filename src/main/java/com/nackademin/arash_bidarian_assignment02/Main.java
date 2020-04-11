package com.nackademin.arash_bidarian_assignment02;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.addition(2,2));
	
		
		
//		Ange värde
//		local double tal1 = 0.0;
//		double tal2 = 0.0;
//		double result = 0.0;
		System.out.println("Choose opreations:" );
		System.out.println("addition, subtraction, multiplication, division" );
		System.out.println("absolute value , x 3, 10 x,x^y,  n!, mod" );

		
	
// 		This reads the input provided by user 
//	    using keyboard
 
			double num1 = 0.0;
			double num2 = 0.0;
	        Scanner inputValue = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	
	        // This method reads the number provided using keyboard
	        num1 = inputValue.nextDouble();
	        
	        System.out.print("Enter second number: ");
	        num2 = inputValue.nextDouble();
	
	        // Closing Scanner after the use
	        inputValue.close();
	        
	        // Calculating product of two numbers
	        double product = num1*num2;
	        
	        // Displaying the multiplication result
	        System.out.println("Output: "+product);
	        System.out.println("Output: "+ num1*num2);
	  
	        
//			Case E
//			BasicOperations (addition, subtraction, multiplication, division) and 
//			AdvancedOperations (five operations of your choice, e.g. 
//			square root, absolute value, 1/x, x 2, x 3, 10 x, n!, mod etc.)
//			Skrivut: Vilken operation vill du använda? 
//			Addition (A)?
//			Substraction (S)?
//			Multipication (M)?
//			Division (S)?
//
	        
	        
	     
//	       System.out.println("Ange operation: ");
//	        
//	       Scanner scan= new Scanner(System.in);
//	       //For string
//	       String text= scan.nextLine();
//	       System.out.println(text);
//	       //for int
//	       int num= scan.nextInt();
//	       System.out.println(num);
//	       // for double
//	       double numDouble = scan.nextDouble();
//	       System.out.println(numDouble);
//	       
	       //  för att göra en double med två decimaler!!
	       //DecimalFormat dc = new Decimalformat("#.##"); 
	       // double value = random.nwxtDouble()*200;
	       // System.out.println(the value with 2 decimal is: " + dc.format(value))
	       
	       
//	        String funktionName = "";
//	        switch (text) {
//	        	case "addition" : anropa addition funktion;
//	        		break;
//	        	case subtraction: anropa subtraction funktion;
//        			break;
//	        	case multiplication: anropa multiplication funktion;
//
//    				break;
//	        	case division: anropa division funktion;
//    				break;
//    				
//    				
//    				absolute value , x 3, 10 x,x^y,  n!, mod
//    				
//	        	case powerOf: anropa powerOf funktion;
//    				break;
//	        	case restMod: anropa restMod funktion;
//    				break;
//	        	case n!: anropa n! funktion;
//    				break;
//	        	case 10Powerofx: anropa 10Powerofx funktion;
//    				break;
//	        	case xPowerof3: anropa xPowerof3 funktion;
//    				break;
//	        	case absoluteValue: anropa absoluteValue funktion;
//    				break;
//	        	      

//
//	       }
	        
//
//			Case dubeltalig funktion  =>
//			ANROPA LÄS TAL1 & TAL2 funkläsaren
//	    	Anropa funktion    
	        
//	    	Case Enkeltalig
//	    	Anropa läs ett tal funkläsaren
//	    	Anropa funktion
	        
	        
	        
//			Addition
//			Skriv ut: Ange tal1
//			Läs tal1
//			Skriv ut: Ange tal2
//			Läs tal2
//			Skriv ut; Tal1 + Tal 2 = tal1 + tal2  
//			Substraction 
//
//			Skriv ut: Ange tal1
//			Läs tal1
//			Skriv ut: Ange tal2
//			Läs tal2
//			Skriv ut; Tal1 - Tal 2 = tal1 –  tal2  
//		 
//
//		Case M 
//
//		Skrivut: Vilken operation vill du använda? 
//		Addition (A)?
//		Substraction (S)?
//		Multipication (M)?
//		Division (S)?
//
//		Square (S)
//		…
//
//		Case Square  
//
//		Skriv ut: Ange tal
//		Läs tal1
//
//		Skriv ut; Tal1 upphöjd till två = tal1 square  2  
//		
				
		
		
		
	}

}
