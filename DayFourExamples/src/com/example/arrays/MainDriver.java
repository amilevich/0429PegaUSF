package com.example.arrays;

public class MainDriver {

	/*
	 * array - collection of elements of the same type and a fixed size
	 * 
	 * elements should be primitives
	 */

	public static void main(String[] beardedLady) {

		int tempOne[] = { 1, 2, 3, 4 };
		
	//System.out.println(tempOne[1]);
		
		tempOne[2]=50;
		
		//System.out.println(tempOne[0] + " " + tempOne[1] + " " + tempOne[2]);
		
		//System.out.println(beardedLady);
		
		//String bearderLady[] = {"Hello", "Goodbye", "Hey"};
		
		int tempTwo[] = new int[9004];
		// an array of size 9004
		// int arrays are initialized as 0 by default
		
		// float -> 0.0f
		// boolean -> false
		// char -> '/u0000'/ unicode null character
		
		tempTwo[3] = 60;
		
		Boolean tempThree[] = new Boolean[3000];
		
		int tempFour[][] = { {9,10,11,0}, {4,2,7}, {6,6,5} };
		//System.out.println(tempFour[0][3]);
		
		int tempFive[][][][][]; // totally possible
		
		int tempSix[][] = new int[10][12];
		tempSix[5][8] = 80;
		//System.out.println(tempSix[5][8]);
		
		int tempSeven[] = new int[100];
		//tempSeven[100]=90; //an exception
		
		tempSix[5] = tempSeven; //totally possible
		
		System.out.println(tempSeven.length);
		// the size/length of array
		
		Object objArray[] = new Object[5];
		
		

	}

}
