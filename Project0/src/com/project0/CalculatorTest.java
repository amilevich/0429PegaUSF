package com.project0;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	
	Calculation calc = new Calculation();
	
	@BeforeClass
	public static void methodCalledBeforeAllTests() {
		System.out.println("***WELCOME TO JUNIT***");
	}

	@Test
	public void areTwoIntegersEqual() {
		assertEquals("should return true", true, calc.withdraw(4,4));
		System.out.println("method to check the balance");
	}
	
	
	@After
	public void afterMethod() {
		System.out.println("**************after each method**************");
	}
	
	/*
	 * @Ignore - ignores the method test that has this annotation
	 * 
	 * @After - have a method that will run after each test
	 * 
	 * @Before - have a method that will run before each test
	 * 
	 * @AfterClass - have a method that will run after the whole class
	 * 
	 * @BeforeClass - have a method that will run before the whole class
	 */
}