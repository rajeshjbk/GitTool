package com.raj.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.raj.service.ArithmeticOperations;

public class ArithmeticOperationsTest {

	@Test
	public void sumWithPositiveValues() {
		
		double a=100.0;
		double b=200.0;
		double expected = 300.0;
		
		ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
		
		double actual = arithmeticOperations.sum(a, b);
		
		assertEquals(expected, actual);
		
	}
	@Test
	public void sumWithNegativeValues() {
		
		double a=-100.0;
		double b=-200.0;
		double expected = -300.0;
		
		ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
		
		double actual = arithmeticOperations.sum(a, b);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void sumWithZeroValues() {
		
		double a=0.0;
		double b=0.0;
		double expected = 0.0;
		
		ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
		
		double actual = arithmeticOperations.sum(a, b);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	@Disabled
	public void sumWithBigValues() {
		
		double a=1111111111.0;
		double b=2222222222.0;
		double expected = 3333333332.0;
		
		ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
		
		double actual = arithmeticOperations.sum(a, b);
		
		assertEquals(expected, actual,5,"Test Failed with Big values");
		
	}
}
