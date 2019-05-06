package com.example.Q10;
import java.util.Scanner;

public class MinimumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Scanner takes user input
		int num1;//variable 1
		
		int num2;//variable 2
		
		System.out.println("Please enter your first number");//ask user for input
		num1 = sc.nextInt();//stores user input
		
		System.out.println("Please enter your second number");//ask user for input
        num2 = sc.nextInt();//stores user input
        sc.close();//close out the scanner
        if(num1< num2) {//compare num1 1 to 2 
        	System.out.println(num1 + " Is the smallest number!!");
        }else {//compare 2 to 1
        	System.out.println(num2 + " Is the smallest number!!");
        	
        }
	}

}
