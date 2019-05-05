package problem_19;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	//public class OddEvenSum {  // Save as "OddEvenSum.java"
		// determine the even 
		// determine the odd numbers
		// create a program that would stores numbers from 1 to 10 in an array
		// Print out all the even numbers from the array
		
			   public static void main(String[] args) {
			     
			// Declare the variables
			// Define the bounds    
			      int lowerbound = 1, upperbound = 10;  
			      
			      int sumOdd  = 0; 
			      
			      // For accumulating odd numbers, init to 0
			      
			      int sumEven = 0;  
			      
			      // For accumulating even numbers, init to 0
			      
			      int absDiff;        
			      // defined the absolute difference between the two sums

			      // Use a while loop to add the sums from lowerbound to upperbound
			      
			      int number = lowerbound;   
			      while (number <= upperbound) {  
			            
			    	  
			         if (number % 2 == 0) {  
			            sumEven += number;   
			         } else {                
			            sumOdd += number;    
			         }
			         ++number; 
			         
			         //  up date the loop for the next number
			      }
			      
			      
			      if (sumOdd > sumEven) {
			         absDiff = sumOdd - sumEven;
			      } else {
			         absDiff = sumEven - sumOdd;
			      }
			      
			      // use one liner conditional expression to calculation of even and odd numbers
			      
			 
			      // Print out the results
			      
			      System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is: " + sumOdd);
			      System.out.println("The sum of even numbers from " + lowerbound + " to " + upperbound + " is: " + sumEven);
			      System.out.println("The absolute difference between the two sums is: " + absDiff);
			   }
			}

