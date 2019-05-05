package com.homework.one;

import com.homework.one.data.DataHolder;
/*
 * Write a program that would access two float-variables from a class that exists in another package. 
 * Note, you will need to create two packages to demonstrate the solution.
 */
public class QuestionEleven {
/*
 * Main Driver
 */
	public static void main(String[] args) {
		System.out.println("my two floats are: " + DataHolder.ONEHUNDRED + " and " + DataHolder.TWOHUNDRED + "They are contained in seperate package");

	}

}
