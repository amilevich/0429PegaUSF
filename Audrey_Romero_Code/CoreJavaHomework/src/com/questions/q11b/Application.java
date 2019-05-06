package com.questions.q11b;
import com.questions.q11a.*;
/**
 * This program modifies and accesses two float variables in a separate package
 * utilizing public methods belonging to the class they are located in(FloatVariables.java).
 * Prints their values to the console.
 * @author Audrey Romero
 *
 */
public class Application {

	public static void main(String[] args) {
		FloatVariables f = new FloatVariables(); // Instantiates a new instance of FloatVariables.
		
		// Modifies its member variables.
		f.setOne(3.14159f);
		f.setTwo(6.62607004f);
		
		// Retrieves the values and prints them to the console.
		System.out.println("The first float variable in package 11a is: " + f.getOne());
		System.out.println("The second float variable in package 11a is: " + f.getTwo());

	}

}
