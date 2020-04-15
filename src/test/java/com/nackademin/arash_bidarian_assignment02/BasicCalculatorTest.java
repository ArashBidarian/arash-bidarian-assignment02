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

//	Random Test for operations addition, subtraction, multiplication, division
//=============================================================================
// assertEquals(initieringen.funktion/metod(värde1,värde2, värde att matcha, avvikelsetollerans))

	//	Random Test for addition
	@Test
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
	
	// Coverage additon
	@Test
	public void coverageTestAddition() {
		assertEquals(bcTest.addition(5 , 10), 15, 0);
		assertEquals(bcTest.addition(-10, 5), -5, 0);
		assertEquals(bcTest.addition(20, -10), 10, 0);
		assertEquals(bcTest.addition(0, -10), -10, 0);
		assertEquals(bcTest.addition(0, 0), 0, 0);

		}
	

	//	Random Test for subtraction
	@Test
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
	
	// Coverage subtraction
	@Test
	public void coverageTestSubtraction() {
		assertEquals(bcTest.subtraction(5 , 10), -5, 0);
		assertEquals(bcTest.subtraction(-10, 5), -15, 0);
		assertEquals(bcTest.subtraction(20, -10), 30, 0);
		assertEquals(bcTest.subtraction(0, -10), 10, 0);
		assertEquals(bcTest.subtraction(0, 0), 0, 0);

		}
	

	//	Random Test for  multiplication
	@Test
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
	
	// Coverage multiplication
	@Test
	public void coverageTestMultiplication() {
		assertEquals(bcTest.multiplication(5 , 10), 50, 0);
		assertEquals(bcTest.multiplication(-10, 5), -50, 0);
		assertEquals(bcTest.multiplication(20, -10), -200, 0);
		assertEquals(bcTest.multiplication(0, -10), 0, 0);
		assertEquals(bcTest.multiplication(0, 0), 0, 0);

		}

	
	//	Random Test for division
	
	@Test
	// assertEquals(initieringen.funktion/metod(värde1,värde2, värde att matcha, avvikelsetollerans))
	public void randomTestDivision() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempResult = 0.0;
		for (int i = 0;  i < 100; i++) {
			tempRandomValue1 = random.nextInt()/9.0;
			tempRandomValue2 = random.nextInt()/9.0;
			tempResult = tempRandomValue1 / tempRandomValue2; 
			LOG.info("Testing the method addition wtih: " + tempRandomValue1 + " & " + tempRandomValue2);
			assertEquals(bcTest.division(tempRandomValue1, tempRandomValue2), tempResult, 0);		
		}
	}	

	// Coverage

	@Test
	public void coverageTestDivision() {
		assertEquals(bcTest.division(5.0 , 10), 0.5, 0);
		assertEquals(bcTest.division(-10, 5), -2, 0);
		assertEquals(bcTest.division(20, -10), -2, 0);
		assertEquals(bcTest.division(0, -10), 0, 0);
		assertEquals(bcTest.division(-10, -10), 1, 0);
		assertEquals(bcTest.division(10, 0), -0.123456789, 0);
		}
	
	
}

