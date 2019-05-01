package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainDriver {
	
	/*
	 * Serialization
	 * is the mechanism of converting the state of an object into
	 * byte stream
	 * 
	 * Deserialization
	 * reverse process, byte stream is used to recreate the actual 
	 * Java object in memory
	 * 
	 * to make it happen:
	 * we implement Serializable marker interface
	 * 
	 * The ObjectOutputStream class contains the writeObject() method
	 * for serializing an object
	 * 
	 * The ObjectInputStream class contains the readObject() method
	 * for deserializing an object
	 */
	
	public static void main(String[] args) {
		
		String filename = "./sampleObjectFile.txt";
		Salmon sal = new Salmon(true, "Sal", "purplegreencreme", 3.25);
		
		writeObject(filename, sal);
		readObject(filename);
		
	}
	
	public static void writeObject(String filename, Object obj) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			
			oos.writeObject(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readObject(String filename) {
		try(ObjectInputStream ois = new 
				ObjectInputStream(new FileInputStream(filename))){
			
			Object obj = ois.readObject();
			System.out.println(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
