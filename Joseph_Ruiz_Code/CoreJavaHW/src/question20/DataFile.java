package question20;

// Name: DataFile.java
// Author: Joe Ruiz
// Date: 05/02/2019
// Print out formatted data from a file

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataFile {

	public static void main(String[] args) {
		// Set the filename
		String filename = "./Data.txt";
		String line;
		String[] fields;
		try {
			// Open the file
			BufferedReader in = new BufferedReader(new FileReader(filename));
			while (true) {
				// Read the line as a String, end if it is null (end of file)
				line = in.readLine();
				if (line == null) break;
				// Split it at the separators to make an array
				fields = line.split(":");
				// Print each field where it belongs
				System.out.println("Name: " + fields[0] + " " + fields[1]);
				System.out.println("Age: " + fields[2] + " years");
				System.out.println("State: " + fields[3] + " State");
				System.out.println(); // extra println to make it look better
			}
			// Close the file reader
			in.close();
		} catch (FileNotFoundException e) {
			// File Not Found
			System.out.println(e);
		} catch (IOException e) {
			// "I/O exception of some sort" (actual words from the javadoc)
			// that's very helpful (not)
			System.out.println(e);
		}
	}

}
