package hw1.q20;

import java.io.BufferedReader;
import java.io.FileReader;

public class Question20 {
	private static BufferedReader reader;

	public static void main(String[] ars) {
		String fileName = "Data.txt";
		readString(fileName);
	}

	public static void readString(String filename) {
		try {
			reader = new BufferedReader(new FileReader("Data.txt"));
			String str;
			while ((str = reader.readLine()) != null) {
				String[] data = str.split(":");
				System.out.println("Name: " + data[0] + " " + data[1]);
				System.out.println("Age: " + data[2] + " years");
				System.out.println("State: " + data[3] + " State");
				System.out.println("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}