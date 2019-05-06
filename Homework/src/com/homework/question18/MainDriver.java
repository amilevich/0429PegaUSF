package com.homework.question18;

import java.util.Scanner;

public class MainDriver extends NewClass {
	
	public MainDriver(String str) {
		
		super(str);
		
	}
	
	public static void main(String[] args) {
		
		//a new string is created
		String sIn;
		
		//the new class is set to user
		NewClass user;
		
		//this scanner checks to see if a string is entered
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		
		//a try and catch block is created to handle an incorrect entry
		while(true) {
			try {
				sIn = sc.nextLine();
				user = new NewClass(sIn);
				break;
			} catch(NumberFormatException ignore) {
				System.out.println("Please enter a numeric value.");
			}
		}
		
		boolean upper = user.upperCase();
		
		//the string is examined for uppercase letters. what is printed depends on the presence of uppercase letters
		if(upper) {
			System.out.println("1: " + sIn + " has uppercase letters");
		} else {
			System.out.println("1: " + sIn + " has no uppercase letters");
		}
		
		//should no uppercase letters be present, all letters are converted to uppercase
		String upStr = user.upperConvert();
		System.out.println("2: " + sIn + " has been converted to uppercase ->" + upStr);
		
		//the original string entered by the user is converted to an int and 10 is added to it
		int plusTen = user.intConvert();
		System.out.println("3: " + sIn + " plus 10 is " + plusTen);
	}

}
