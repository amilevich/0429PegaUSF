package com.homework.question03;

public class ReverseStrings {

	static String Reverse(String string, int length) {

		//sets up a character array
		char[] charA = string.toCharArray();

		//a for loop which contains an if statement for the length of the array minus 1
		//if the statement is true, then the string will be reversed
		for (int i = 0; i < length; i++) {
			
			if (i < length - 1) {
				
				char firstChar = charA[length - 1];
				char lastChar = charA[i];
				
				charA[i] = firstChar;
				charA[length - 1] = lastChar;
				
				length--;
			}
		}

		
		//a new string is created. this is the string that will be reversed
		String thisIsAString = new String(charA);

		//returns the previously created string
		return thisIsAString;
	}

	public static void main(String[] args) {
		
		
		//string to be reversed
		String thisIsAString = "Golden Opportunity";

		//length of the string
		int sLength = thisIsAString.length();

		System.out.println("The original string: " + thisIsAString);
		
		//this tells the console to reverse the string, and the line below it prints the reversed string
		String newString = Reverse(thisIsAString, sLength);
		
		System.out.println("Reversed string: " + newString);
	}

}
