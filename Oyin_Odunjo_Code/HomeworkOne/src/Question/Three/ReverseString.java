//*****WILL NOT RUN******

package Question.Three;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String ToBeReversed) {
		
		//We can test the code by using a scanner to get the word 
		System.out.println("Please enter a word to be reversed: ");
		Scanner scan = new Scanner(System.in);
		ToBeReversed = scan.next().toString();
		scan.close();
		
		System.out.println("Word to be Reversed is: " + ToBeReversed);
		
		System.out.println("The reverse of that word is: ");
		
		for(int i = ToBeReversed.length() - 1; i >=0 ; i--) {
			//This loop will go through the length of the string and print it
			//from the end to the beginning, ie in reverse 
			
			System.out.println(ToBeReversed.charAt(i));
			
		}
		
	}
}
