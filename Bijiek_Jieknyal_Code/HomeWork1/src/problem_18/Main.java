package problem_18;

import java.util.Scanner;

public class Main {

//import java.util.Scanner;

	// Convert Lowercase Character to Uppercase

    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        // Enter character in the lower case
        
        System.out.print("Enter a Character in Lowercase : ");
        ch = scan.next().charAt(0);
		
        temp = (int) ch;
        temp = temp - 32;
        ch = (char) temp;
        
		// Display equivalent character in the Upercase
        
        System.out.print("Equivalent Character in Uppercase = " +ch);
    }
}