package com.banker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Documenting {
	public static void addToList(String filename, String input) {
		try(FileWriter writer = new FileWriter(filename, true)){
			// false - would create a new file each time
			// true - appends to the existing file
			writer.write("\n"+input);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readCharacterStream(String filename) {
		try(FileReader reader = new FileReader(filename)){
			int i;
			while((i = reader.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
