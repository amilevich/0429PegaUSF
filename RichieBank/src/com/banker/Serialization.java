package com.banker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Serialization {
	
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
		BankAccount JohnDoe = new BankAccount();
		long range = 99999999999L;
		//All Bank Account Numbers will be generated randomly
		Random r = new Random();
		long number = (long)(r.nextDouble()*range);
		
		JohnDoe.setUsername("JohnDoe65");
		JohnDoe.setPassword("p2ssw4rd");
		JohnDoe.setfirstName("John");
		JohnDoe.setlastName("Doe");
		JohnDoe.setAccount(number);
		JohnDoe.setBalance(40000);
		
		String filename =Long.toString(JohnDoe.getAccount())+".txt";
		
		writeObject("MasterFiles/" + filename, JohnDoe);
		BankAccount JaneDoe=new BankAccount();
		JaneDoe = readObject("MasterFiles/" +filename);
		System.out.println(JaneDoe);
		System.out.println(JaneDoe.getAccount()+JaneDoe.getPassword());
		
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
	
	public static BankAccount readObject(String filename) {
		try(ObjectInputStream ois = new 
				ObjectInputStream(new FileInputStream(filename))){
			
			Object obj = ois.readObject();
			return (BankAccount) obj;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}