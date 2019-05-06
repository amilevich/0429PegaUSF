package com.homework.question17;

import java.util.ArrayList;
import java.util.Scanner;

public class InterestScan {

	//
	public static ArrayList<String> scanForData() {
		
		//interest and principal are set to doubles because they are monetary values
		double interest;
		double principal;
		
		//years is an int because it needs no decimals
		int years;
		
		//a new arraylist of strings is created
		ArrayList<String> cus = new ArrayList<>();
		
		//this scanner examines the value put in the rate of interest field
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Rate of Interest: ");
		
		//a try and catch block is placed for incorrect value format
		while(true) {
			try {
				interest = Double.parseDouble(sc1.next());
				break;
			} catch(NumberFormatException ignore) {
				System.out.println("Please enter a numeric value.");
			}
		}
		
		//a new interest string is set to the interest double and added to the customer arraylist
		String intStr = Double.toString(interest);
		cus.add(intStr);
		
		
		// this scanner examines the value placed in the principal field
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Principal: ");
		
		//a try and catch block is placed for incorrect value format
		while(true) {
			try {
				principal = Double.parseDouble(sc2.next());
				break;
			} catch (NumberFormatException ignore) {
				System.out.println("Please enter numeric value.");
			}
		}
		
		//a new principal string is created and added to the customer arraylist
		String prStr = Double.toString(principal);
		cus.add(prStr);
		
		//this scanner examines the number of years specified by the user
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("# of Years: ");
		
		//a try and catch block is placed for an incorrect value format exception
		while(true) {
			try {
				years = Integer.parseInt(sc3.next());
				break;
			} catch(NumberFormatException ignore) {
				System.out.println("Please enter correct number of years.");
			}
		}
		
		//a new string is created for the amount of years and is added to the customer arraylist
		String yeStr = Integer.toString(years);
		
		cus.add(yeStr);
		
		//this method returns the arraylist
		return cus;
	}
	
	public static void main(String[] args) {
		
		//the customer arraylist is set to the data scan method
		ArrayList<String> cus = scanForData();
		
		double rate = Double.parseDouble(cus.get(0));
		double princ = Double.parseDouble(cus.get(1));
		int year = Integer.parseInt(cus.get(2));
		
		//the total interest is set to the rate of interest times the principal times the amount of time
		double interest = princ * rate * year;
		
		System.out.println("Interest (Total): $" + interest);

	}

}
