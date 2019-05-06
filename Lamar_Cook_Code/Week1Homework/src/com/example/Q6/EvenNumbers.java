package com.example.Q6;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		int num = 0;//variable assigned the value of 0
		
		Scanner sc = new Scanner(System.in);//Scanner to take user input
		System.out.println("Please enter any Integer...");
		num = sc.nextInt();//Stores user input that was entered
		
		
		if((num /2)*2==num) {//If number is even then print out results
			System.out.println("It is a Even Number");
		}else {//if number is odd then print that it is odd
			System.out.println("This is not an EVEN Integer");
		}

	}

}
