package com.example.Q17;

import java.util.Scanner;

public class Interest {
	
	
	
	private Scanner sc;
	
	public static void main (String [] args) {
	    double principle; //My Variables
		double rate;
		double time;
		double result;
		//scanner to take user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please enter the Principle amount...");
		principle = sc.nextDouble();//Takes user input for principle and stores it to Scanner
		
		System.out.println("Please enter the Rate of Interest");
		rate = sc.nextDouble();//Takes the rate and stores it in Scanner
		
		System.out.println("Please enter the time period in Years");
		time = sc.nextDouble();//Take the time and stores it to Scanner
		
		result=(principle* rate*time)/100;//calculates results to determine Interest
		System.out.println("The results for your interst are " + result);//Prints Interest
	}
	
	
	

}
