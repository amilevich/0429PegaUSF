package Q18;

import java.util.Scanner;

//Write a program having a concrete subclass that inherits three abstract methods from a superclass.  
//Provide the following three implementations in the subclass corresponding to the abstract methods in the superclass: 

//1. Check for uppercase characters in a string, and return ‘true’ or ‘false’ depending if any are found.
//2. Convert all of the lower case characters to uppercase in the input string, and return the result. 
//3. Convert the input string to integer and add 10, output the result to the console.

//Create an appropriate class having a main method to test the above setup.

public class SuperClass {

	public static void main(String[] args) {

		String string = new String("Hot dogs are GOOD!");

	}

	public class Capitals extends SuperClass {
		Scanner in = new Scanner(System.in);
	      //Uppercase
	      String string = "";
	      String x = in.next();
	      int z = x.length();{
	    	  
	      for(int y = 0; y < z; y++){
	         if(Character.isUpperCase(x.charAt(y))){
	            char w = x.charAt(y);
	            Object isUp = isUp + w + " ";
	         }
	         }
	      }
	      System.out.println("The uppercase characters are " + isUp);
	      //Uppercase

	}

	public class Lowers extends SuperClass {

	}

	public class Integers extends SuperClass {

	}

}
