package Question.Ten;

public class TernaryOperators {

	//Finding the minimum of two numbers using ternary operators 
	
	public static void MinNum(int numOne, int numTwo) {
		
		//If the numOne is less than the numTwo then assign "true" to "NumOneMinimum"
		//Else assign it "false"
		boolean NumOneMinimum = (numOne < numTwo) ? true : false; 
		//using the ternary operator to check 
		
		if(NumOneMinimum == true) { 
			//If it turns out to be true that numOne is smaller than numTwo, print that out 
			System.out.println(numOne + " is less than " + numTwo);
			
		}else {
			//Print this out if numTwo is less than numOne, meaning the condition 
			//turned out to be false 
			System.out.println(numTwo + " is less than " + numOne);
		}
		
	}
}
