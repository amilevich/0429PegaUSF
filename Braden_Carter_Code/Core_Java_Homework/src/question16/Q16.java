package question16;
import java.util.Scanner;
public class Q16 {



	    
	    
	                
	        public static void main(String[] args) {
	            
	            
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Please enter a string: ");
	            //prompts user for string input
	            String input = sc.nextLine();
	            //uses user entered string as input
	            
	            int count = 0;
	            //starting count number = 0
	                
	            for(int i = 0; i < input.length(); i++) {
	                if(input.charAt(i) != ' ')
	                    count++;
	                sc.close();
	             //counts number of non blank characters
	            }
	                
	            System.out.println("Number of characters for the string you entered is... drumroll please... " + count);
	       //displays number of characters
	        }
	    }