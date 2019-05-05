package question10;
import java.util.Scanner;

public class min {
    public static void main(String[] args) 
    {
    	// declaring number variables and result.  Cool is the compairson.  
        int num1, num2, result, cool;
        /* Scanner is used for getting user input. 
         * The nextInt() method of scanner reads the
         * integer entered by user.
         */
        // askes for input of the numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number:");
        num1 = scan.nextInt(); 

        
        System.out.println("Enter Second Number:");
        num2 = scan.nextInt();
        scan.close();
        
        
        // compares whether num 1 or 2 is smaller, and then declare the smallest number
        cool = num1<num2 ? num1:num2;
        System.out.println("The smallest number is: " + cool);
}
}

