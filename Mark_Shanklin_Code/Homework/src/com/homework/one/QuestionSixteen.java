package com.homework.one;

/*
 * Write a program to display the number of characters for a string input. 
 * The string should be entered as a command line argument using (String [ ] args).
 */
public class QuestionSixteen {

	public static void main(String[] args) {
		
		int total = 0;
		for(String s : args)
		{
			total += s.length();
			//args is space delimited so print length of each word
			System.out.println(s + ": length is " + s.length());
			total++;
		}
		//print total string length including spaces
		System.out.println("total length is " + (total-1));
	}

}
