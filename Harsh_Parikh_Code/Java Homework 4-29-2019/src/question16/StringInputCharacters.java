package question16;

import java.util.Scanner;

public class StringInputCharacters {
			
    public static void main(String[] args) {  
        	int count = 0;    
	
    	// Ask user to input a string
    //	Scanner sc = new Scanner(System.in);
//    	System.out.print("Please enter a string: ");
  //  	String input = sc.nextLine();
        	
        	
    	for (String s : args) {
    		count += s.length();
    	}
    	    		System.out.println(count);

    	// initialize the counter variable
   
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in your entered string is: " + count);    
    }    
}     
// google command line things
