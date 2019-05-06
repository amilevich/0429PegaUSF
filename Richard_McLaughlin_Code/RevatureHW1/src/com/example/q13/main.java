package com.example.q13;
import com.example.evenquestion.*;
import com.example.q5.CharacterIndex;

public class main {

	public static void main(String[] args) {
		// Start with the triangle height, and then the user can modify the output
		int height=4;
		triangle(height);

	}

	public static int triangleArea(int triangleHeight) {
		//This gives me the total number of 0s and 1s that I will need to print to the screen
		int triangleArea=0;
		for (int x=triangleHeight-1; x >0; x--) {
			triangleArea=triangleArea+x;
		}
		return triangleArea;
	}
	
	public static char[] ZeroesAndOnes(int triangleHeight) {
		//Generating an alternating 0 and 1 character set is the way that I will print the
		//"area" of the triangle. Every even index will be a zero and every odd index will be a 
		//1. The total length needed is based off of the user inputed triangleHieght which is used
		//by the previous function to obtain the triangle Area, which gives us the total number of
		//zeroes and ones
		//Easier to work with it as an array of characters
		
		//This will also use the isEven function from a previous example
		char[] ZeroesAndOnes=new char[triangleArea(triangleHeight)];
		for (int i=0; i<triangleArea(triangleHeight); i++) {
			if(Main.isEven(i)) {
				ZeroesAndOnes[i]='0';
			}
			else {ZeroesAndOnes[i]='1';}
		}
		return ZeroesAndOnes;
	}
	
	public static void printSpaces(char[] toScreen) {
		/*
		 * In the hw problem description, there are spaces between each of the zeroes and ones on
		 * each line. I have simply defined a new function to take care adding the spaces for me.
		 */
		
		//begin the process by printing out a new line, and then use a for loop to 
		//populate this new line
		System.out.println("");
		for (int j=0; j<toScreen.length; j++) {
			System.out.print(toScreen[j]+" ");
		}
	}
	
	public static void triangle(int triangleHeight) {
		/*
		 * This command uses 2 for loops to print the ZeroesAndOnes result onto a line in a 
		 * triangle format. A new line must be printed in the x for loop, not the y for loop.
		 * 
		 * The x for loop will print the new line while the y or loop populates the "toScreen" character Array.
		 * Additional functions are employed 
		 * 
		 * Since there are two for loops, a counter must be employed to ensure that every value of the ZeroesandOnes character
		 * array is used once and only once and in order.
		 */
		int triangleArea=triangleArea(triangleHeight);
		char[] binaryValues=ZeroesAndOnes(triangleArea);
		int binaryCounter=0;
		int lineNumber=0;
		for (int x=0; x <=triangleHeight-1; x++) {
			//I declare toScreen as an empty character array before the beginning of every for loop
			char[] toScreen = new char[x+1];
			for(int y=0; y<=x;y++) {
				toScreen[y]=binaryValues[binaryCounter];
				binaryCounter=binaryCounter+1;
			}
			lineNumber=lineNumber+1;
			printSpaces(toScreen);
			
			
			
		}
	}

}
