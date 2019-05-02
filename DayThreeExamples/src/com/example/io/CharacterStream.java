package com.example.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	/*
	 * i/o - input/output
	 * 
	 * Character stream - human readable
	 * FileReader & FileWriter
	 * 
	 * Byte stream - machine readable, byte code
	 * FileInputStream & FileOutputStream
	 * 
	 * Large chunks of data vs one character at a time, we have:
	 * BufferedReader, BufferedWriter for character stream
	 * BufferedInputStream, BufferedOutputStream for byte stream
	 */
	public static void main(String[] args) {

		String filename = "./CharExample.txt";
		
		writeCharacterStream(filename);
		readCharacterStream(filename);
		
	}
	
	public static void writeCharacterStream(String filename) {
		try(FileWriter writer = new FileWriter(filename, true)){
			// false - would create a new file each time
			// true - appends to the existing file
			for(int i = 65; i<72; i++) {
				writer.write(i);
			}
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
