package com.homework.question20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainDriver {

	//the main method throws an IO exception
	public static void main(String[] args) throws IOException {

		//a buffered reader is created to access the data file
		BufferedReader br = null;

		//in this try block, the buffered reader accesses the data file directly from its position on the computer's hard drive
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\RedVi\\Documents\\STS Workspace\\Homework\\Data.txt"));
			String readLine;

			//a while loop that splits the data found in the file in the format specified below
			while ((readLine = br.readLine()) != null) {

				String[] dataStr = readLine.split(":");

				System.out.println("Name: " + dataStr[0] + " " + dataStr[1]);
				System.out.println("Age: " + dataStr[2] + " years");
				System.out.println("State: " + dataStr[3] + " State");
				System.out.println("\n");

			}
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {

			if (br != null) {
				br.close();
			}

		}

	}

}
