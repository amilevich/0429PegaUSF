package com.homework.question09;

import java.util.ArrayList;
import java.util.List;

public class PrimeNums {
	
	//a boolean method for determining if a number is prime with an int n passed through it
	public static boolean aNumberIsPrime(int n) {
		
		if(n == 1 || n == 0) {
			return false;
		}
		
		if (n == 2) {
			return true;
		}
		
		if(n % 2 == 0) {
			return false;
		}
		
		for(int i = 3; i * i <= n; i+= 2) {
			
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		//three arraylists are created: the first will include all numbers from 1 to 100, the second will store all prime numbers, and the third will
		//-> store all composite numbers
		List<Integer> aList = new ArrayList<>();
		List<Integer> pList = new ArrayList<>();
		List<Integer> cList = new ArrayList<>();
		
		//a for loop that adds all numbers between 1 and 100 to the first arraylist
		for(int i = 1; i <= 100; i++) {
			aList.add(i);
		}
		
		//System.out.println(aList);
		
		//this for loop checks if numbers in the first arraylist are prime
		for(int primeNumbers : aList) {
			
			boolean isPrime = aNumberIsPrime(primeNumbers);
			
			//if a number is prime, it is added to the second array list
			if(isPrime) {
				
				//System.out.println("Prime: " + primeNumbers);
				pList.add(primeNumbers);
				
			} else {
				
				//otherwise, it is added to the third arraylist
				
				//System.out.println("Composite: " + primeNumbers);
				cList.add(primeNumbers);
				
			}
		}
		
		
		System.out.println("Composite Numbers: " + cList);
		System.out.println("Prime Numbers: " + pList);
	}

}
