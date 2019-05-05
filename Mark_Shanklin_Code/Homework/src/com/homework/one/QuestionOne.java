package com.homework.one;

/*
 * Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
 */
public class QuestionOne {

	public static void main(String[] args) {
		// given in question
		int[] sortArray = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };

		System.out.println("Unsorted Array:");
		printArray(sortArray);
		bubbleSort(sortArray);
		System.out.println("Sorted Array:");
		printArray(sortArray);
	}

	/*
	 * Method used to bubble sort the array passed in
	 */
	public static void bubbleSort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// swap the current index value with the next index value
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/*
	 * Method used to print out array in custom manner.
	 */
	public static void printArray(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
