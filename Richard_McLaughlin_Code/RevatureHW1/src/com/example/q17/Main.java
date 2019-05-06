package com.example.q17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner BankInput = new Scanner(System.in);
		
		System.out.println("Enter the principal amount: ");
		int principal = BankInput.nextInt();
		
		System.out.println("Enter the % interest rate: ");
		float interestRate=BankInput.nextFloat();
		
		System.out.println("Enter the number of years: ");
		int time=BankInput.nextInt();
		
		float alpha=CalculateInterest(principal, time, interestRate);
		System.out.println(alpha);
		
		}
	
	public static float CalculateInterest(int principal, int time, float interestRate) {
		float interest=principal*interestRate*time/100;
		return interest;

	}

}
