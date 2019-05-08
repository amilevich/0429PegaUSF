package com.revature.daos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//import org.apache.log4j.Logger;

import com.revature.beans.User;

public class UserSerializer implements UserDao {

//	private Logger log = Logger.getRootLogger();
	public static final UserSerializer us = new UserSerializer();
	private static User currentUser;

	private UserSerializer() {
		super();
	}

	@Override
	public boolean createUser(User u) {
//		log.debug("creating user");
		if (u == null) {
			return false;
		}
		File f = new File("src/main/resources/users/" + u.getUsername() + ".txt");
		System.out.println(f.getName());
		
		
		if (f.exists()) {
			return false;
		}
		try {
			f.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
		try (ObjectOutputStream oos = new ObjectOutputStream(
			
		    new FileOutputStream("src/main/resources/users/" + u.getUsername() + ".txt"))) {

			oos.writeObject(u);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		// verify that what was passed in is not null
		if (username == null || password == null) {
			return null;
		}
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("src/main/resources/users/" + username + ".txt"))) {

			currentUser = (User) ois.readObject(); // retrieve the user if it can
			// verify that the password matches
			if (password.equals(currentUser.getPassword())) {
				return currentUser;
			} else {
				return null;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		return null;
	}

	public static User getCurrentUser() {
		return currentUser;
	}

	@Override
	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("src/main/resources/users/" + currentUser.getUsername() + ".txt"))) {

			oos.writeObject(currentUser);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public void deleteUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositYeet(double yeet) {
		currentUser.depositYeet(yeet);

	}

	@Override
	public void withdrawYeet(double yeet) {
		// TODO Auto-generated method stub
		currentUser.withdrawYeet(yeet);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return currentUser.getBalance();
	}

	@Override
	public boolean addHistory(String newHistory) {
		if (newHistory == null) {
			return false;
		}
		currentUser.addHistory(newHistory);
		return true;
	}

	@Override
	public String getHistory() {
		// TODO Auto-generated method stub
		return currentUser.getHistory();
	}

}
