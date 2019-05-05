package com.example.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Calculator.Calculator;

public class CalculatorTest {

	/*
	 * JUnit - testing framework, specifically, a unit testing framework.
	 * 
	 * Unit testing - testing a small portion of your program, typically, a method.
	 * (As opposed to integration testing - testing a lot of stuff at once)
	 * 
	 * JUnit is important for TDD (Test Driven Development). TDD means writing your
	 * tests before you write your code.
	 * 
	 * Benefits: 1) Planning - it requires you to think/plan what you want from each
	 * piece of code 2) Modularity - units can be reused and they work by themselves
	 * (independent) 3) Saves time/efficient
	 * 
	 * JUnit provides us with static methods from the org.junit.assert class to test
	 * for certain conditions.
	 * 
	 * These methods usually start with "assert" and let you specify an error
	 * message, the expected result, and the actual result. If the test fails, the
	 * Assert method will throw an AssertionException.
	 *
	 */
	
	Calculator calc = new Calculator();
	
	@BeforeClass
	public static void methodCalledBeforeAllTests() {
		System.out.println("***WELCOME TO JUNIT***");
	}

	@Test
	public void areTwoIntegersEqual() {
		assertEquals("should return true", true, calc.areTwoIntegersEqual(4,4));
		System.out.println("method to check the equality of two integers tested");
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
