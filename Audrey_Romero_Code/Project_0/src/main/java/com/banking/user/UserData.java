package com.banking.user;
import java.io.*;
import java.util.*;

public class UserData implements Serializable {	
	/**
	 * Class stores, implements, and retrieves user data for this program
	 */
	private static final long serialVersionUID = 722851872538950639L;
	private static String filename = "./UserData.txt";
	private static List<User> userList = new ArrayList<User>();
	
	
	public UserData() {
	}
	
	
	public static List<User> getUserList() {
		return userList;
	}
	
	public static void addUser(String username, String password, String name) {
		userList.add(new Customer(username, password, name));
	}
	
	public static String getFilename() {
		return filename;
	}
	
	public static Boolean matchUsername(String str) {
		for (User u : userList) {
			if (str.equals(u.getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	public static User getUser(String str) {
		for (User u : userList ) {
			if (str.equals(u.getUsername())) {
				return u;
			}
		}
		return null;
	}
	
	public static void printUserList() {
		for (User u : userList) {
			System.out.println(u);
		}	
	}
	
	public static void writeUser(String filename, List<User> li) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(li);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readUser(String filename) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			userList = (List<User>)ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void addAdmin(String username, String password, String name ) {
		userList.add(new Admin(username, password, name));
	}
}
