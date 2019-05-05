package problem_20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import enscapsulate.problem_20.Encapsulate;

public class Main {

	// create data.txt notepad file 
	
	public static void main(String[] args) {

		// create data.txt folder using notepad
		// enter people's information in the data.txt file
		// copy and paste the URL of the folder directory

		String fileName = "C://Users/bgatwech31/Desktop/RevatureAssignments/Servers/Data.txt";
		String line = null;
		
		// used character Streams to write the characters data type
		
		writeCharacterStream(fileName);
		
		// used character streams to read characters data type
		
		readCharacterStream(fileName);

		// catch exceptions using try statement
		// read character from the file
		// test for errors
		try {
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			// used bufferReader to read data in the file
			// sort people by names, ages, and states
			
			while ((line = bufferedReader.readLine()) != null) {
				String[] spaces = line.split(":");
				System.out.println("Name: " + spaces[0] + " " + spaces[1]);

				System.out.println("Age: " + spaces[2] + " years");

				System.out.println("State: " + spaces[3] + " state \n");

			}
			bufferedReader.close();
			
		// catch exceptions
		// code to handle errors
			
		} catch (FileNotFoundException ex) {

			System.out.println(" Unable to open file '" + fileName + "' ");
		}

		catch (IOException ex) {

			System.out.println("error reading file '" + fileName + "' ");
		}
	}

	private static void readCharacterStream(String fileName) {

	}

	private static void writeCharacterStream(String fileName) {

	}

}
