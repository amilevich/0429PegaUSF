package Problem3;

public class Main {

	

// create public class reverseString
// create reverse string without using a temporary variable
	
	 public static void main(String[] args) {

		  String input = "AliveisAwesome";
		  
		  //create reverse string method to pass input string
		  
		  String reversed = reverseString(input);
		  System.out.println("The reversed string is: " + reversed);
		  
		 }
		 
	 	// used reverse string to determine whether string is empty or not 
	 
		 public static String reverseString(String input)
		 {
		  if (input.isEmpty()){
		   return input;
		  }
		  // used recursion function to reverse the string
		  
		  return reverseString(input.substring(1)) + input.charAt(0);
		 }
		 
		}