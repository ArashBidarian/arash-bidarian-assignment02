package com.nackademin.arash_bidarian_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bcTest = new BasicCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());

	BasicCalculator bc = new BasicCalculator();

//	Random Test for addition, subtraction, multiplication, division
//==================================================================
	
	//	Random Test for addition
	@Test
	// assertEquals(initieringen.funktion/metod(värde1,värde2, värde att matcha, avvikelsetollerans))
	public void randomTestAddition() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempResult = 0.0;
		for (int i = 0;  i < 5; i++) {
			tempRandomValue1 = random.nextInt()/9.0;
			tempRandomValue2 = random.nextInt()/9.0;
			tempResult = tempRandomValue1 + tempRandomValue2; 
			LOG.info("Testing the method addition wtih: " + tempRandomValue1 + " & " + tempRandomValue2);
			assertEquals(bcTest.addition(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	//	Random Test for subtraction
	@Test
	// assertEquals(initieringen.funktion/metod(värde1,värde2, värde att matcha, avvikelsetollerans))
	public void randomTestSubtraction() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempResult = 0.0;
		for (int i = 0;  i < 5; i++) {
			tempRandomValue1 = random.nextInt()/9.0;
			tempRandomValue2 = random.nextInt()/9.0;
			tempResult = tempRandomValue1 - tempRandomValue2; 
			LOG.info("Testing the method addition wtih: " + tempRandomValue1 + " & " + tempRandomValue2);
			assertEquals(bcTest.subtraction(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}

	//	Random Test for  multiplication
	@Test
	// assertEquals(initieringen.funktion/metod(värde1,värde2, värde att matcha, avvikelsetollerans))
	public void randomTestMultiplication() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempResult = 0.0;
		for (int i = 0;  i < 5; i++) {
			tempRandomValue1 = random.nextInt()/9.0;
			tempRandomValue2 = random.nextInt()/9.0;
			tempResult = tempRandomValue1 * tempRandomValue2; 
			LOG.info("Testing the method addition wtih: " + tempRandomValue1 + " & " + tempRandomValue2);
			assertEquals(bcTest.multiplication(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}
	
	//	Random Test for division
	
	@Test
	// assertEquals(initieringen.funktion/metod(värde1,värde2, värde att matcha, avvikelsetollerans))
	public void randomTtestDivision() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempResult = 0.0;
		for (int i = 0;  i < 5; i++) {
			tempRandomValue1 = random.nextInt()/9.0;
			tempRandomValue2 = random.nextInt()/9.0;
			tempResult = tempRandomValue1 / tempRandomValue2; 
			LOG.info("Testing the method addition wtih: " + tempRandomValue1 + " & " + tempRandomValue2);
			assertEquals(bcTest.division(tempRandomValue1, tempRandomValue2), tempResult, 0);		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

