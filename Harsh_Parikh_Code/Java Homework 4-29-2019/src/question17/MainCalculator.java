package question17;

import java.util.Scanner;

public class MainCalculator {
	    public static void main(String args[]) 
	    {
	        double p, r, t;
	        
	        // ask user for input on p, r, and t
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the Principal : ");
	        p = sc.nextDouble();
	        System.out.print("Enter the Rate: ");
	        r = sc.nextDouble();
	        System.out.print("Enter the number of years: ");
	        t = sc.nextDouble();
	        
	        // declare simple interest
	        long si;
	        // calculate simple interest 
	        si = (long) (r * t * p) ;
	        // return simple interest
	        System.out.print("The Simple Interest on Principal is : " + si);
	    }
}

	
	

