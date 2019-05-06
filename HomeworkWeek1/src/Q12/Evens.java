package Q12;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * Write a program to store numbers from 1 to 100 in an array. 
 * Print out all the even numbers from the array. Use the enhanced 
 * FOR loop for printing out the numbers.
 */

public class Evens {

	public static void main(String[] args) {
		final int size = 100;
		int[] arr = new int[size];

		for (int i = 0; i < size; i++)
			arr[i] = i + 1;

		for (int num : arr)
			if (num % 2 == 0)
				System.out.println(num);
		
	}
}