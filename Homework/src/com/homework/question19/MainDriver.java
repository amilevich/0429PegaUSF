package com.homework.question19;

import java.util.ArrayList;
import java.util.List;

public class MainDriver {
	
	//this method examines if the contents of the arraylist are even or odd
	public static int evenOrOdd(int n) {
		
		//if n mod 2 is equal to 0, then a value of 1 is returned. otherwise, a value of 0 is returned
		if(n % 2 == 0) {
			
			return 1;
			
		} else {
			return 0;
		}
	}
	
	//this method examines whether or not the numbers in the arraylist are prime numbers
	public static boolean primeNum(int n) {
		
		//of n is equal to 1 or 0, the number is not a prime number
		if(n == 1 || n == 0) {
			return false;
		}
		
		//if n is equal to 2, the number is a prime number
		if(n == 2) {
			return true;
		}
		
		//if the number is divisible by 2, the number is composite
		if(n % 2 == 0) {
			return false;
		}
		
		//a for loop that examines if an int i=3, i times itself is less than or equal to n, and i = i plus 2
		for(int i = 3; i * i <= n; i += 2) {
			
			//if n is divisible by i, then it is a composite number 
			if(n % i == 0) {
				return false;
			}
		}
		
		//otherwise, n is a prime number
		return true;
	}

	public static void main(String[] args) {
		
		//an arraylist of integers is created
		List<Integer> aList = new ArrayList<>();
		
		//two doubles are created
		double even = 0;
		double odd = 0;
		
		//a for loop that adds all numbers between 1 and 10
		for(int i = 1; i <= 10; i++) {
			aList.add(i);
		}
		
		System.out.println("ArrayList: " + aList);
		
		//these booleans check for even and odd numbers 
		boolean isEven = true;
		boolean isOdd = true;
		
		//a for loop made to check if a number is even or odd
		for(int i = 0; i < aList.size(); i++) {
			
			int checkForEvenOrOdd = evenOrOdd(aList.get(i));
			
			//this if statement includes a while loop to print all even numbers
			if(checkForEvenOrOdd == 1) {
				
				while(isEven) {
					System.out.println("Even Numbers: ");
					isEven = false;
				}
				
				System.out.println(aList.get(i) + " ");
				even += aList.get(i);
			}
		}
		
		//all even numbers are added together
		System.out.println("Even total: " + even);
		
		
		for(int i = 0; i < aList.size(); i++) {
			
			int checkForEvenOrOdd = evenOrOdd(aList.get(i));
			
			//this if statement includes a while loop to print all odd numbers
			if(checkForEvenOrOdd == 0) {
				
				while(isOdd) {
					System.out.println("Odd Numbers: ");
					isOdd = false;
				}
				
				System.out.println(aList.get(i) + " ");
				odd += aList.get(i);
			}
		}
		
		//all odd numbers are added together
		System.out.println("Odd total: " + odd);
		
		//this for loop removes all prime numbers
		for(int i = 0; i < aList.size(); i++) {
			boolean prime = primeNum(aList.get(i));
			
			if(prime) {
				aList.remove(i);
			}
		}
		
		//all composite and non-prime numbers are printed
		System.out.println("Composite numbers: " + aList);
	}

}
