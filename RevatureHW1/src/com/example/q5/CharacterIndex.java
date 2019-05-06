package com.example.q5;

public class CharacterIndex {

	public static void main(String[] args) {
		String myString = "Hello, World";
		int start=0;
		int dex=8;
		String alpha=RichiesIndex(myString, start, dex);
		System.out.println(alpha);

	}
	public static String RichiesIndex(String myString, int start, int dex) {
		
		//I decided that I wanted to add another variable in case I want to
		//index this string at a specific value
		
		char[] output = new char[dex];
		for (int x = start; x<dex; x=x+1) {
			output[x]=myString.toCharArray()[x];
		}
		String outputString = new String(output);
		return outputString;
	}

}
