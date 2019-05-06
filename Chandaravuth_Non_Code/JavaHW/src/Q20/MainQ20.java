package Q20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainQ20 {

	public static void main(String[] args) {
		String filename = "./Data.txt";
		
		try {
			printTextFile(readTextFile(filename));
		}catch(Exception e){
			System.out.println("ERROR");
		}
		

	}

	public static String[] readTextFile(String filename) {
		File file = new File(filename);
		ArrayList<String> arrlist = new ArrayList<String>();
		String s = null;
		if (file.exists()) {

			try {

				FileReader readfile = new FileReader(file);
				BufferedReader bufferReader = new BufferedReader(readfile);
				while ((s = bufferReader.readLine()) != null) {
					arrlist.add(s);

				}
				return arrlist.toArray(new String[arrlist.size()]);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else
			System.out.println("File does not exist");
		return null;

	}

	public static void printTextFile(String[] s) {
		String firstname = "";
		String lastname = "";
		String age = "";
		String state = "";
		int count = 0;
		int copyindex = 0;

		for (String s1 : s) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == ':') {
					if (count == 0) {
						firstname = s1.substring(0, i);
						// System.out.println(s1.substring(0, i));
						copyindex = i;
						count++;
					} else if (count == 1) {
						lastname = s1.substring(copyindex + 1, i);
						// System.out.println(s1.substring(copyindex+1, i));
						copyindex = i;
						count++;
					} else if (count == 2) {
						age = s1.substring(copyindex + 1, i);
						// System.out.println(s1.substring(copyindex+1, i));
						copyindex = i;
						count++;
					} else {
						state = s1.substring(copyindex + 1, i);
						// System.out.println(s1.substring(copyindex+1, i));
						copyindex = 0;
						count = 0;
					}

				}

			}
			System.out.println("Name: " + firstname + " " + lastname);
			System.out.println("age: " + age + " years");
			System.out.println("state: " + state + " state");
			System.out.println();

		}

	}
}
