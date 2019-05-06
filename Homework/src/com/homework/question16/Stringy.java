package com.homework.question16;

public class Stringy {

	public static void main(String[] args) {
		
		//a for loop that checks for all instances of string abc inside of arguments
		for(String abc: args) {
			
			//the number of characters inside the string is printed along with the specified length
			System.out.print("# of characters in String " + abc + ": ");
			System.out.println(abc.length());
			
		}

	}

}
