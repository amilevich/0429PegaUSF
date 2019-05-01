package com.example.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStream {
	
	public static void main(String[] args) {
		
		String filename = "./ByteFile.txt";
		// C:/Users/Users...
		// ./src/com.example
		
		//writeByteStream(filename);
		readByteStream(filename);
		
	}
	
	public static void writeByteStream(String filename) {
		try(OutputStream os = new FileOutputStream(filename)) {
			os.write(65);
			os.write(66);
			os.write(12);
			os.write(152);
			os.write(72);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readByteStream(String filename) {
		try(InputStream is = new FileInputStream(filename)){
			int i;
			while ((i = is.read()) != -1) {
				System.out.print(i + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("got an exception, yo );");
		}
	}

}
