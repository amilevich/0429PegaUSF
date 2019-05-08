package com.project0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriterReader {

	public static void writerReader() {

//		Person p1 = new Person("John", 30, "Male");
//		Person p2 = new Person("Rachel", 25, "Female");

		try {
			// FileOutputStream f = new FileOutputStream(new File("Data_Input.txt"));
			// ObjectOutputStream o = new ObjectOutputStream(f);

			// // Write objects to file
			// o.writeObject(p1);
			// o.writeObject(p2);
			//
			// o.close();
			// f.close();
			//
			FileInputStream fi = new FileInputStream(new File("Data_Input.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			InformationObject information = (InformationObject) oi.readObject();
			Information.userName = information.getUserName();
			Information.userID = information.getUserID();
			Information.userBalance = information.getUserBalance();
			System.out.println(information.toString());
			System.out.println("Full Name: " + information.getUserName());
			System.out.println("Username: " + information.getUserID());
			System.out.println("Current Balance: " + information.getUserBalance());
			

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}