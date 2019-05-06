package com.questions.q20;
import java.io.*;
/**
 * This program  demonstrates basic file I/O. It reads information from a text file. 
 * The information is then formatted in a way that is easily readable and printed to
 * the console.
 * @author Audrey Romero
 */
public class FileRead {
	/**
	 * Specifies the file from which to read and calls the readFile method in order
	 * to read and print out its contents.
	 * @param args
	 */
	public static void main(String[] args) {
		String file = "./Data.txt";
		
		readFile(file);
		
	}
	
	/**
	 * Creates a new reader, information is then read and stored in a String.
	 * Using methods of the String class, it then formats the resulting string
	 * in a way that the information is easily readable.
	 * @param filename    The source file from which to read
	 */
	public static void readFile(String filename) {
		//Input streams must be enclosed in a try-catch block!
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			int n;
			String s = "";
			
			while ((n = reader.read()) != -1) { // -1 is returned from read() when it reaches end of file.
				if (n == 58 | n == 13) { // ASCII values for colon and carriage return.
					s += " "; // Replaces with spaces for easier splitting of the String.
					continue;
				} else {
				    s += (char)n;
				}
			}
			
			String[] split = s.split(" "); // Split the String into an array at each space
			
			/*
			 * Prints all elements of the String array to the console in readable format.
			 * In addition to removing carriage returns above, we must also remove any occurrences
			 * of a new line. Because the order of information repeats through the string, the
			 * modulus operator can be use in if and else-if statements to ensure all information
			 * is also printed to the console in its respective place.
			 */
			for (int i = 0; i < split.length; i++) {
				if (split[i].contains("\n")) {
					split[i] = split[i].substring(1);
				}
				
				if (i % 4 == 0) {
					// Includes first name and last name
					System.out.println("Name: " + split[i] + " " + split[i + 1]);
				} else if (i % 4 == 2) {
					System.out.println("Age: " + split[i] + " years");
				} else if (i % 4 == 3) {
					System.out.println("State: " + split[i] + " state\n");
				}
			}
			
			reader.close(); // Closes the input stream.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
