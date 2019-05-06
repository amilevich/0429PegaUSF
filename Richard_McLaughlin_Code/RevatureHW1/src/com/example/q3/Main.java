package com.example.q3;



public class Main {
	public static void main(String[] args) {
		String myString="Hello, World";
//		String gnirtSyM="dlroW ,olleH";
//		System.out.println(myString);
//		System.out.println(Integer.toHexString(myString.hashCode()));
//		System.out.println(Integer.toHexString(gnirtSyM.hashCode()));
//		System.out.println(myString.toCharArray().length);
//		String myString1 = new String("Sample1");
//		System.out.println(myString1);
//		String myString2 = new String("Sample2");
//		System.out.println(myString2);
		
		//The green hash of text was all testing
		RichiesReverse(myString);
		int x = myString.toCharArray().length-1;
	
	}
	
	public static void RichiesReverse(String myString) {
		//Use a for loop, start at the length and then go down
		for (int x = myString.toCharArray().length-1; x>=0; x--) {
		
			System.out.print(myString.toCharArray()[x]);
			
		}
	}

}
