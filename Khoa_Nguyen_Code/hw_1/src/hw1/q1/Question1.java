package hw1.q1;

import java.util.Arrays;

public class Question1 {
	public static void main(String args[]) {
		int[] intArray = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
		for (int i = 0; i < intArray.length; i++) {
			for (int k = i; k < intArray.length; k++) {
				if (intArray[i] > intArray[k]) {
					int x = intArray[i];
					intArray[i] = intArray[k];
					intArray[k] = x;
				}
			}
		}
		System.out.println(Arrays.toString(intArray));
	}
}
