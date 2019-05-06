package com.homework.question12;

public class EvenNumbers {

	static void arrayPrint(int arrayOne[]) {
		
		//an int n is set to the length of the array
		int n = arrayOne.length;
		
		//for an int i being less than n, the array is printed
		for(int i = 0; i < n; ++i) {
			
			System.out.println(arrayOne[i] + " ");
			
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {

		//an array is create with a size of 100
		int arrayOne[] = new int[100];
		
		//for another int i being less than the length of the array, the array is set to i plus 1
		for(int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = i + 1;
		}
		
		//a for loop identifying the even numbers in the array
		for(int evenNumbers : arrayOne) {
			
			//if the even numbers mod 2 is equal to 0, then all even numbers in the array are printed
			if(evenNumbers % 2 == 0) {
				System.out.println("Even Numbers: " + evenNumbers);
			}
		}

	}

}
