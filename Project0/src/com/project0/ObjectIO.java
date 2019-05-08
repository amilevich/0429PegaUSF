package com.project0;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//public class ObjectIO {
//
//	private static final String filepath = "Data_Input.txt";
//	static String filename = "Data_Input.txt";
//
//	public static void main(String args[]) {
//
//		ObjectIO objectIO = new ObjectIO();
//
//		InformationObject information = new InformationObject(Information.userName, Information.userID,
//				Information.userPassword, Information.userBalance);
//		objectIO.WriteObjectToFile(information);
//		// Deserialization
//		try {
//
//			// Reading the object from a file
//			FileInputStream file = new FileInputStream(filename);
//			ObjectInputStream in = new ObjectInputStream(file);
//
//			// Method for deserialization of object
//			information = (InformationObject) in.readObject();
//
//			in.close();
//			file.close();
//			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
//
//		}
//
//		catch (IOException ex) {
//			System.out.println("IOException is caught");
//		}
//
//		catch (ClassNotFoundException ex) {
//			System.out.println("ClassNotFoundException" + " is caught");
//		}
//	}
//
//	public void WriteObjectToFile(Object serObj) {
//
//		try {
//
//			FileOutputStream fileOut = new FileOutputStream(filepath);
//			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//			objectOut.writeObject(serObj);
//			objectOut.close();
//			System.out.println("The Object  was succesfully written to a file");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

public class ObjectIO {
	public static void objectIO() {
		// InformationObject object = new InformationObject("ab", 20, 2, 1000);
		String filename = "Data_Input.txt";
		InformationObject information = new InformationObject(Information.userName, Information.userID,
				Information.userPassword, Information.userBalance);

		System.out.println(information);

		// Serialization
		try {

			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(information);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		//information = null;

		// Deserialization
		try {

			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			information = (InformationObject) in.readObject();

			in.close();
			file.close();
			System.out.println("Object has been deserialized");

			// System.out.println("z = " + object1.z);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
}
