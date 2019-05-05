package com.homework.one;

/*
 * Write a program to store numbers from 1 to 100 in an array. 
 * Print out all the even numbers from the array. 
 * Use the enhanced FOR loop for printing out the numbers.
 */
public class QuestionTwelve {

	public static void main(String[] args) {
		int count = 100;
		int[] array = new int[count];

		//add 1-100 into the array
		for (int i = 0; i < count; i++) {
			array[i] = i + 1;
		}
		
		//for every integer in array
		for(int num : array)
		{
			//spilt into rows
			if(num % 20 == 0)
			{
				System.out.println();
			}
			//check if is even
			if(QuestionSix.isEven(num))
			{
				//if even print
				System.out.print(num + " ");
			}
		}
	}

}
