package com.homework.question01;

public class BubbleSort {

	// bubble sort repeatedly examines the contents of an array in the order that
	// they appear and places
	// -> them in order until the entire array is sorted

	// array contents: 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4

	static void BubbleSort(int arrayOne[]) {
		
		
		//an int is defined for the length of the array
		int arrayLength = arrayOne.length;
		
		
		//for loop that will execute if an int i is less than the length of the array minus 1 and incremented once
		for (int i = 0; i < arrayLength - 1; i++) {
			
			//a similar for loop has been set for an int j, however, the statement executes if j is less than the length minus int i minus 1
			for (int j = 0; j < arrayLength - i - 1; j++) {
				
				//the bubble sort statement
				if (arrayOne[j] > arrayOne[j + 1]) {

					int t = arrayOne[j];

					arrayOne[j] = arrayOne[j + 1];

					arrayOne[j + 1] = t;
				}
			}
		}
	}

	static void arrayPrint(int arrayOne[]) {

		
		//this sets the length of the array
		int n = arrayOne.length;

		//a for loop to print the array at the determined length
		for (int i = 0; i < n; ++i) {
			System.out.println(arrayOne[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {

		//contents of the array are placed here
		int[] arrayOne = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };

		System.out.println("Array contents: ");
		arrayPrint(arrayOne);

		//the previously defined BubbleSort method is applied here
		BubbleSort(arrayOne);

		System.out.println("Bubble sort array: ");
		arrayPrint(arrayOne);

	}

}
