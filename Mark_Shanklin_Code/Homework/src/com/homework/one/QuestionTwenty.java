package com.homework.one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.homework.one.data.Person;

/*
 * Create a notepad file called Data.txt and enter the following:
 * Mickey:Mouse:35:Arizona
 * Hulk:Hogan:50:Virginia
 * Roger:Rabbit:22:California
 * Wonder:Woman:18:Montana
 * Write a program that would read from the file and print it out to the 
 * screen in the following format:
 * Name: Mickey Mouse
 * Age: 35 years
 * State: Arizona State
 */
public class QuestionTwenty {
	/*
	 * Main driver
	 */
	public static void main(String[] args) {
		// file for the data
		final String filename = "./src/com/homework/one/Data.txt";
		// list of people from the file
		List<Person> myList = readFile(filename);
		// make sure list got people
		if (myList != null) {
			// go through list
			for (Person p : myList) {
				// find mickey
				if (p.getFirstname().equals("Mickey")) {
					// print him
					System.out.println(p);
				}
			}
		} else {
			// didn't get data from file
			System.out.println("empty list");
		}

	}

	/*
	 * Method used to read the file
	 */
	public static List<Person> readFile(String filename) {
		//try to read the file using filereader in bufferedreader
		try (BufferedReader reader = new BufferedReader(new FileReader(filename), 16 * 2024)) {
			//pass to scanner for delimiting
			Scanner read = new Scanner(reader);
			//list to store people from file
			List<Person> myList = new ArrayList<Person>();
			//go tell end of file
			while (read.hasNext()) {
				//get first line
				String line = read.nextLine();
				//Separate it by :
				String[] elements = line.split(":");
				//add the separated elements to a new person in the list
				myList.add(new Person(elements[0], elements[1], elements[2], elements[3]));
			}
			//close the scanner and BufferReader
			read.close();
			reader.close();
			return myList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
