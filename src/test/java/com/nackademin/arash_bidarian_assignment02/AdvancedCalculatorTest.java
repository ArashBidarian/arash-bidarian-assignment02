package com.nackademin.arash_bidarian_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {

	AdvancedCalculator acTest = new AdvancedCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

	AdvancedCalculator ac = new AdvancedCalculator();

	//Random test for Operations: square, cube, tenToPowerOf, xToPowOfY, absValue, invers, mod
	//========================================================================================
	// assertEquals(initieringen.funktion/metod(värde1,värde2, värde att matcha), avvikelsetollerans);
	
	// Random Test for square
	@Test

	public void randomTestSquare() {
		double tempRandomValue1 = 0.0;
		double tempResult = 0.0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextInt() / 9.0;
			tempResult = tempRandomValue1 * tempRandomValue1;
			LOG.info("Testing the method square wtih: " + tempRandomValue1);
			assertEquals(acTest.square(tempRandomValue1), tempResult, 0);
		}
	}

	// Coverage square
	@Test
	public void coverageTestSquare() {
		assertEquals(acTest.square(2), 4, 0);
		assertEquals(acTest.square(-2), 4, 0);
//		assertEquals(acTest.square(-0.1), 0.01, 0); ?? 
		assertEquals(acTest.square(0), 0, 0); 
//
	}

	
	
	//Random test for Operations: cube
	@Test
	public void randomTestCube() {
		double tempRandomValue1 = 0.0;
		double tempResult = 0.0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextInt() / 9.0;
			tempResult =  Math.pow(tempRandomValue1, 3);
			LOG.info("Testing the method cube wtih: " + tempRandomValue1);
			assertEquals(acTest.cube(tempRandomValue1), tempResult, 0);
		}
	}
	
	// Coverage Cube
	@Test
	public void coverageTestCube() {
		assertEquals(acTest.cube(2), 8, 0);
		assertEquals(acTest.cube(-2), -8, 0);
//		assertEquals(acTest.cube(-0.1), -0.001, 0);  ??
		assertEquals(acTest.cube(0), 0, 0);
	}
	
	
	//Random test for Operations: tenToPowerOf
	@Test
	public void randomTenToPowerOf() {
		double tempRandomValue1 = 0.0;
		double tempResult = 0.0;
		for (int i = 0; i < 100; i++) {
			tempRandomValue1 = random.nextInt() / 9.0;
			tempResult = Math.pow(10, tempRandomValue1);
			LOG.info("Testing the method tenToPowerOf with: " + tempRandomValue1);
			assertEquals(acTest.tenToPowerOf(tempRandomValue1), tempResult, 0);
		}
	}
	
	
	// Coverage tenToPowerOf
	@Test
	public void coverageTestTenToPowerOf() {
		assertEquals(acTest.tenToPowerOf(2), 100, 0);
		assertEquals(acTest.tenToPowerOf(-2), 0.01, 0);
		assertEquals(acTest.tenToPowerOf(-2), 0.01, 0);
		assertEquals(acTest.tenToPowerOf(0), 1, 0);
	}
	
	
	//Random test for Operations: xToPowOfY
	@Test
	public void randomTestXToPowOfY() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempResult = 0.0;
		for (int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextInt() / 9.0;
			tempRandomValue2 = random.nextInt() / 9.0;
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			LOG.info("Testing the method xToPowOfY wtih: " + tempRandomValue1 + " to the power of " + tempRandomValue2);
			assertEquals(acTest.xToPowOfY(tempRandomValue1, tempRandomValue2), tempResult, 0);
		}
	}
	
	
	// Coverage square
	@Test
	public void coverageTestXToPowOfY() {
		assertEquals(acTest.xToPowOfY(2, 3), 8, 0);
		assertEquals(acTest.xToPowOfY(-2,3), -8, 0);
//		assertEquals(acTest.xToPowOfY(-0.1, 2), 0.01, 0); ??
		assertEquals(acTest.xToPowOfY(5, 0), 1, 0); 

	}
	
	
	//Random test for Operations: absValue
	@Test
	public void randomTestAbsValue() {
		double tempRandomValue1 = 0.0;
		double tempResult = 0.0;
		for (int i = 0; i < 100; i++) {
			tempRandomValue1 = random.nextInt() / 9.0;
			tempResult = Math.abs(tempRandomValue1);
			LOG.info("Testing the method absValue wtih: " + tempRandomValue1);
			assertEquals(acTest.absValue(tempRandomValue1), tempResult, 0);
		}
	}
	
	// Coverage inverse
	@Test
	public void coverageTestAbsValue() {
		assertEquals(acTest.absValue(5.0), 5.0, 0);
		assertEquals(acTest.absValue(-10), 10, 0);
		assertEquals(acTest.absValue(-0.1), 0.1, 0);
		assertEquals(acTest.absValue(0), 0, 0);		
	}
	
	
	//Random test for Operations:  invers
	@Test
	// assertEquals(initieringen.funktion/metod(värde1,värde2, värde att matcha), avvikelsetollerans);
	public void randomTestInvers() {
		double tempRandomValue1 = 0.0;
//		double tempRandomValue2 = 0.0;
		double tempResult = 0.0;
		for (int i = 0; i < 100; i++) {
			tempRandomValue1 = random.nextInt() / 9.0;
//			tempRandomValue2 = random.nextInt() / 9.0;
			tempResult = 1/ tempRandomValue1;
			LOG.info("Testing the method invers wtih: " + tempRandomValue1);
			assertEquals(acTest.invers(tempRandomValue1), tempResult, 0);
		}
	}
	
	
	// Coverage inverse
	@Test
	public void coverageTestInvers() {
		assertEquals(acTest.invers(5.0), 0.2, 0);
		assertEquals(acTest.invers(-10), -0.1, 0);
		assertEquals(acTest.invers(-0.1), -10, 0);
		assertEquals(acTest.invers(100), 0.01, 0);
		assertEquals(acTest.invers(0), -0.123456789, 0);
		
	}

}
