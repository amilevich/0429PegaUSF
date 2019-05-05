package com.homework.one;

import java.util.Scanner;

/*
 * Write a program that calculates the simple interest on the principal, 
 * rate of interest and number of years provided by the user. 
 * Enter principal, rate and time through the console using the Scanner class.
 * 			Interest = Principal* Rate* Time
 */
public class QuestionSeventeen {
/*
 * Main Driver
 */
	public static void main(String[] args) {
		//used to get user input
		Scanner scan = new Scanner(System.in);
		// variables used to store data entered
		int interest;
		int principle = 0;
		int rate = 0;
		int time = 0;
		//collect data
		System.out.println("Enter the principal ");
		principle = scan.nextInt();
		System.out.println("Enter the rate ");
		rate = scan.nextInt();
		System.out.println("Enter the time ");
		time = scan.nextInt();
		//calculate simple interest
		interest = principle * rate * time;
		
		//print out the simple interest
		System.out.println("The simple interest is: " + interest);
		scan.close();
	}

}
