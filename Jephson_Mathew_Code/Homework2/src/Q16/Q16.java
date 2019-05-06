package Q16;
import java.util.Scanner;


public class Q16 {
	
	
	            
	    public static void main(String[] args) {  
	        
	        // Ask user to input a string
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Please enter a string: ");
	        String input = sc.nextLine();
	        
	        // initialize the counter variable
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < input.length(); i++) {    
	            if(input.charAt(i) != ' ')    
	                count++;    
	            sc.close();
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in your entered string is: " + count);    
	    }    
	}     
	    

