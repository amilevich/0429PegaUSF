package com.homework.question15;

public class MainDriver extends Testing {

	public static void main(String[] args) {
		
		Testing calc = new MainDriver();
		
		double val1 = 9;
		double val2 = 5;
		
		System.out.println("Values for calculation: " + val1 + ", " + val2);
		
		System.out.println("Sum:" + calc.add(val1, val2));
		System.out.println("Difference:" + calc.subtract(val1, val2));
		System.out.println("Product:" + calc.multiply(val1, val2));
		System.out.println("Quotient:" + calc.divide(val1, val2));

	}

}
