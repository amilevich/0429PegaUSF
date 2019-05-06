package com.example.q9;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Start by initializing our array
		ArrayList<Integer> ninetyNinePrimes = new ArrayList<Integer>();
		for (int x = 1; x < 101; x = x + 1) {
			ninetyNinePrimes.add(x);
		}
		//System.out.println(ninetyNinePrimes);
		printThePrimes(ninetyNinePrimes);
	
		
		//go through all of the numbers between 1 and 100 and add them to the array
	}

	
	public static void printThePrimes(ArrayList<Integer> ninetyNinePrimes){
			
		
		System.out.print("2, 3"); 
		
		/*
		 * The means of prime detection we are about to use will not work for 2
		 * and 3, but it will work for every number after that.
		 * 
		 * This method is literally testing 
		 */
				
		for(int x : ninetyNinePrimes) {
			int y = 2;
			if (x>3) {
				while (y<x) {
					int z=x%y;
					if(z==0) {
						break;
					}
					y=y+1;
					if(y==(x/2)) {
						System.out.print(", " + x);
						break;
						} 
					//using x rather than x/2 would still work, it's just that if no 
					//zero remainder is found by x/2, then no value after that will
					//return a zero remainder. Therefore, be more efficient and just
					//end at x/2 (or technically x/2-0.5) for the odd numbers
					
					}
				}
			}
		}
}
