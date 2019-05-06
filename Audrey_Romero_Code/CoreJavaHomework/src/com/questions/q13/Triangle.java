package com.questions.q13;
/**
 * This program prints a formatted triangle of 1s and 0s to the console 
 * using for loops.
 * @author Audrey Romero
 */
public class Triangle {

	public static void main(String[] args) {
		/**
		 * Because the amount of characters printed on each row corresponds with the
		 * number of the row. We will utilize <code>int collumn</code> and <code>int row</code>
		 * as counters in the loop. When the value of collumn exceeds the value of row,
		 * the program moves to the next line.
		 */
		int collumn = 0; 
		int row = 0;
		
		/**
		 * Taking advantage of the fact that 20 is a common multiple of 2 and 4, we can
		 * create a loop that repeats enough times to generate the output and ensures the
		 * correct character will be printed every time.
		 */
		for (int i = 0; i < 20; i++) { 
			
			    if(i == 0 | i % 4 == 0) {
				    System.out.print("0 ");
				    collumn++;
				    
			    } else if (i % 2 == 0) {
				    System.out.print("1 ");
				    collumn++;
				    
			    } else if (collumn > row) { // If collumn counter exceeds row, move to next line.
			    	System.out.print("\n");
			    	row++;
			    	collumn = 0;
			    } 

		}
	}

}
