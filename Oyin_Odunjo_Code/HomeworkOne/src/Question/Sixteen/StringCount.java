//**Need a command line input**
package Question.Sixteen;

import java.util.Scanner;

public class StringCount {
	
	public static void main(String[] args) {
		
		//Will take in a string 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String here: ");
		String args1 = scan.nextLine();
				
		
		//Will count the total numbers of characters in a string 
		int numOfChars = 0; //initializing the number of characters in the string
		
		
		//System.out.println("args.length :" + args.length); 
		//String argument = "Thanks"; 
		
		for(int i = 0; i < args1.length(); i++) { //Setting up the loop to iterate through 
				if(args1.charAt(i) != ' ') //Making sure it does not count the spaces in between
					numOfChars++; //will iterate through the string 
		}
		
		//Will print out the count of characters 
		System.out.println("The amount of characters in this string is: " + numOfChars);
		
	}

}
