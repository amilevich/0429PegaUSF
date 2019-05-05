package question05;

import java.util.Scanner;

public class ReverseString {
	// method declaration
	    public static void main(String[] args)
	    {
	    	//returns a message asking user to enter a string
	        System.out.println("Enter string to reverse:");
	        // asks for user for input
	        Scanner read = new Scanner(System.in);
	        String str = read.nextLine();
	        //sets the initial reverse as empty
	        String reverse = "";
	        
	        // decreases iteration by 1 each value/letter in string message, 
	        for(int i = str.length() - 1; i >= 0; i--)
	        {
	        	//
	            reverse = reverse + str.charAt(i);
	        }
	        // returns reversed screen.
	        System.out.println("Reversed string is:");
	        System.out.println(reverse);
	    }
	}