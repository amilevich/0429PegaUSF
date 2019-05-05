package question14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.List;
import java.lang.Math;
import java.text.DateFormat;
import java.text.SimpleDateFormat; 

public class Switch {
    public static void main(String[] args) 
    { 
    	// askes for input between 1 and 3
    	Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 3: ");
        int input = scan.nextInt();

        String method ; 
 
        // switch statement with int data type 
        switch (input) { 
        // takes the square root of the entered value and prints it.
        case 1: 
            method = "Square root"; 
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter number: ");
            int number = myObj.nextInt();
            double squareroot = Math.sqrt(number) ;
            System.out.println("The square root of " + number + " is: " + squareroot );
            break;
            
            // displays the current date in the current format
        case 2: 
            method = "Today's Date"; 
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            Date dateobj = new Date();
            System.out.println(df.format(dateobj));
            break; 
            // prints out the String message
        case 3: 
            method = "StringToArray"; 
            String s = "I am learning core Java";
            ArrayList<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
            System.out.println(myList);  // prints [lorem, ipsum, dolor, sit, amet]
            break; 
        default: 
            method = "Invalid Method"; 
            System.out.println("Invalid");
            break; 
        } 
    } 
}


