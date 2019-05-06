package com.homework.question05;

public class Substring {

	
	//and int idx and a string str are passed through a SubString method
	static String SubString(int idx, String str) {
		
		//initializing the substring
		char[] subString = new char [idx];
		
		//a for loop that sets the previously initialized substring equal to a string being passed through the SubString method
		for(int i = 0; i <= idx - 1; i++) {
			
			subString[i] = str.charAt(i);
			
		}
		
		//a new string is set to the substring
		String sStr = new String(subString);
		
		//returns the newly created string
		return sStr;
	}
	
	
	public static void main(String[] args) {
		
		//int idx is set to 4
		int idx = 4;
		
		//string str is defined
		String str = "Can You Stand The Rain";
		
		System.out.println(str);
		
		//a new string subStr is set to the SubString method
		String subStr = SubString(idx, str);
		
		System.out.println("Substring: " + subStr);

	}
	

}
