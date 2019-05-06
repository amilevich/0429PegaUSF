package com.example.q16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String newString = input.nextLine();
		
		char[] charArray=newString.toCharArray();
		
		System.out.println("Number of Characters:" + charArray.length);
		for (char x : charArray) {
			System.out.print(x + " ");
		}
	}
	
}

