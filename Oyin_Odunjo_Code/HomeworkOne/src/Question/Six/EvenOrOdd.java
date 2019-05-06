package Question.Six;

public class EvenOrOdd {
	
	
	public static void main(String args []) {
		
		int x; //Declaring a variable to be tested 
		x = 201; //Giving a value to that variable x to test the code 
		
		if((x/2)*2 == x)// Return true if x gets the same value back
		// since int cannot accommodate a float, if x is odd, then it will try to return a float
		// which int will get rid of the float value and multiply only the whole 
	// int to 2, resulting in a different value
			System.out.println("This number is Even");
		else
			System.out.println("This number is Odd");
		
	}
	
	

}
