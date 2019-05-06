package Q16;

/*
 * Write a program to display the number of characters for a string input. 
 * The string should be entered as a command line argument using (String [ ] args).
 */

import java.util.Scanner;
public class StringChars {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String s = input.nextLine();
	    
	    // methods should be called with () even if have no argument

	    String total = "";

	    for (int i = 0; i < s.length(); i++) {
	        char thisChar = s.charAt(i);
	        // you can replace with : if (Character.isLowerCase(thisChar))
	        //close the for loop here
	    }
	    System.out.println("Total amount of characters: " + s.length() + " - " + s);
	    
	}
}
