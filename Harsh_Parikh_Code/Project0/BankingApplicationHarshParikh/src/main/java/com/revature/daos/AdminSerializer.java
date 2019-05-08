package com.revature.daos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//import org.apache.log4j.Logger;

import com.revature.beans.Admin;
import com.revature.beans.User;

public class AdminSerializer implements AdminDao {
	private Logger log = Logger.getRootLogger();
	public static final AdminSerializer as = new AdminSerializer();
	private static Admin currentAdmin;
	public void createAdmin(Admin a) {
	log.debug("creating admin");
		if (a == null) {
			return;
		}
		File f = new File("src/main/resources/admins/" + a.getUsername() + ".txt " + a.getFirstName() + " " + a.getLastName() + " " + a.getPassword() + " ");
		System.out.println(f.getName());
		if (f.exists()) {
			return;
		}
		try {
			f.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("src/main/resources/admins/" + a.getUsername() + ".txt" + " "))) {
				

			oos.writeObject(a);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Admin findByUsernameAndPassword(String username, String password) {
		// verify that what was passed in is not null
		if (username == null || password == null) {
			return null;
		}
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("src/main/resources/admins/" + username + ".txt"))) {

			currentAdmin = (Admin) ois.readObject(); // retrieve the user if it can
			// verify that the password matches
			if (password.equals(currentAdmin.getPassword())) {
				return currentAdmin;
			} else {
				return null;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Admin getCurrentAdmin() {
		return currentAdmin;
		
	}
	
	public void updateAdmin(Admin a) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("src/main/resources/admins/" + currentAdmin.getUsername() + ".txt"))) {

			oos.writeObject(currentAdmin);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void viewAllUsers() {
		// TODO Auto-generated method stub
		File folder = new File("src/main/resources/users/");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println("File " + listOfFiles[i].getName());
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}

		}
	}

	@Override
	public void viewUserTransactionHistory(String username) {
		// TODO Auto-generated method stub
		User currentUser = null;
		if (username == null) {
			return;
		}
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("src/main/resources/users/" + username + ".txt"))) {

			currentUser = (User) ois.readObject(); // retrieve the user if it can
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Couldn't find the user!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Couldn't find the user!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Couldn't find the user!");
			e.printStackTrace();
		}
		
		System.out.println(currentUser.getHistory());
	}
}
