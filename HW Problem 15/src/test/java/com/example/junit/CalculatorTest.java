package com.example.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.example.calculator.Calculator;

public class CalculatorTest {
    
    /*
     * JUnit is a unit testing framework.
     *
     * Unit Testing: testing individual methods of a program
     * (as opposed to integration testing - testing a lot of stuff at once).
     *
     * JUnit is crucial to TDD (Test-Driven Development).
     * TDD means writing the test before the code.
     *
     * Benefits:
     * 1. Planning - It requires planning for what is desired from each piece of code.
     * 2. Modularity - Units can be reused and they work independently.
     * 3. Saves Time - is more efficient.
     * JUnit provides static methods from the org.junit.assert class to
     * test for certain conditions.
     *
     * These methods usually start with "assert" and let you specify an error
     * message, the expected result, and the actual result.
     * If the test fails, the Assert method will throw an AssertionException.
     *
     */
    Calculator calc = new Calculator();
    
    @BeforeClass
    public static void methodCalledBeforeAllTests() {
        System.out.println("***J-J-J-JUniiiiiiiit***");
    }
    @Ignore
    @Test
    public void areTwoIntegersEqual() {
        assertEquals("should return true", true, calc.areTwoIntegersEqual(4,4));
        System.out.println("method to check the equality of the two integers tested");
    }
    @Ignore
    @Test
    public void isSum() {
        assertEquals("should return 9", 9, calc.isSum(4,5));
        System.out.println("method to check the equality of the two integers tested");
    }
    @Ignore
    @Test
    public void isDiff() {
        assertEquals("should return 6", 6, calc.isDiff(15,9));
        System.out.println("method to check the equality of the two integers tested");
    }
    @Ignore
    @Test
    public void isPro() {
        assertEquals("should return 5", 5, calc.isProd(1,5));
        System.out.println("method to check the equality of the two integers tested");

    }
    @Ignore
    @Test
    public void isQuot() {
        assertEquals("should return 6", 6, calc.isQuot(12,2));
        System.out.println("method to check the equality of the two integers tested");
    }
    @Ignore
    @Test
    public void isSquare() {
        assertEquals("should return 2.0", 2, calc.isSquare(4.0));
        System.out.println("method to check the equality of the two integers tested");
    }
    @After
    public void afterMethod() {
        System.out.println("\n***after each method***");
    }
    
    /*
     * @Ignore will ignore the specific test with this annotation.
     *
     * @After - have a method that runs after each test.
     *
     * @Before - have a method that runs before each test.
     *
     * @AfterClass - have a method that runs after the whole class.
     *
     * @BeforeClass - have a method that runs before the whole class.
     *
    
     */
}