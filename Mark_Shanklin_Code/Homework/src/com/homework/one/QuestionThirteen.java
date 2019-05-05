package com.homework.one;

/*
 * Display the triangle on the console as follows using any type of loop.  
 * Do NOT use a simple group of print statements to accomplish this.
    0
    1 0
    1 0 1
    0 1 0 1

 */
public class QuestionThirteen {
	public static void main(String[] args) {
		// number of desired rows
		int rowCount = 4;
		// counts up to alternate one and zero
		int count = 0;
		// handles rows of characters
		for (int rows = 0; rows < rowCount; rows++) {
			// handles characters per row
			for (int col = 0; col <= rows; col++) {
				// print out zero or one
				System.out.print((count++ & 1));
			}
			// start new row
			System.out.println();
		}
	}
}
