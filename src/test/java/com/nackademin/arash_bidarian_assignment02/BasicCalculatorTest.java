package com.nackademin.arash_bidarian_assignment02;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bc = new BasicCalculator();
	

	@Test
	// assertEquals(initieringen.funktion/metod(värde1,värde2, värde att matcha, avvikelsetollerans))
	public void test() {
		assertEquals(bc.addition(2,1), 3, 0); 
	}

}
