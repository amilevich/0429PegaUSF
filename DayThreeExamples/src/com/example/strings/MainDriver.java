package com.example.strings;

public class MainDriver {
	
	
	public static void main(String[] args) {
		
		//String stringOne = "BirdPerson";
		String stringOne = new String("BirdPerson");
		String stringTwo = "BirdPerson";
		String stringThree = new String("BirdPerson");
		String stringFour = "BirdPerson";
		
		if(stringOne==stringThree) {
			System.out.println("objects are equal");
		}
//		
//		if(stringOne == stringTwo) {
//			System.out.println("hooray");
//		}
//		
//		if(stringOne == "BirdPerson") {
//			System.out.println("inside if statement");
//		}
		/*
		 * == compares the address/memory location
		 * .equals checks the actual value
		 * 
		 * if BirdPerson is a string literal, the if statement
		 * is true.
		 * if BirdPerson was created using "new" keyword,
		 * the statement is false
		 */
		
		//strings are immutable
		String sOne = "Frank";
		String sTwo = sOne.concat(" and Jimmy");
//		System.out.println(sTwo);
//		System.out.println(sOne);
		
		/*
		 * StringBuilder - mutable
		 * StringBuffer - mutable, thread-safe/synchronized
		 */
		
		String sTen = "Summer";
		StringBuilder sBuilderOne = new StringBuilder(sTen);
		sBuilderOne.append(" and Winter 0_0");
		//System.out.println(sBuilderOne);
		
		StringBuffer sBufferOne = new StringBuffer("Juice");
		sBufferOne.append(" and a bagel...");
		System.out.println(sBufferOne);
		
		
		
		
	}

}
