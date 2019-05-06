package com.questions.q1;
/**
 * This program creates an array of integers and utilizes a Bubble Sort method to
 * order the values from least to greatest and prints to the console the end
 * result.
 * @author Audrey Romero
 */
public class BubbleSort {
	/**
	 * Accepts an array of primitive data types and assigns the length of the array
	 * to <code>length</code>. Loops through the array, checking two numbers at a time
	 * for order. If first number <code>array[j]</code> is greater than second number 
	 * <code>array[j + 1]</code>, the first number is stored in <code>temp</code>
	 * temporarily, so that the values swap indexes of the array.
	 * @param array    Array that is source of values
	 */
	static void bubbleSort(int array[]) {
		int length = array.length;
		
		for (int i = 0; i < length - 1; i++) { // Loop through all values of array
			for (int j = 0; j < length - i - 1; j++) { // Loop through second-to-last value of array
				if (array[j] > array[j + 1]) {
					
					int temp = array[j];
					array[j] = array[j + 1];
				    array[j + 1] = temp;
					
				}
			}
		}
	}
	/**
	 * Prints to the console all elements of an array.
	 * @param array Array that is source of values
	 */
	static void output(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
	}
	/**
	 * Creates a new array of integers and utilizes the methods above to sort
	 * the values and print the result to the console.
	 * @param args
	 */
	public static void main(String[] args) {

	    int data[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
	    
	    System.out.println("New array:");
	    output(data);
	    
	    bubbleSort(data);
	    
	    System.out.println("\n\nSorted:");
	    output(data);
	}

}
