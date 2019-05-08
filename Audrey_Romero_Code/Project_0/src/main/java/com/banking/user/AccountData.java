package com.banking.user;

import java.io.*;
import java.util.*;

public class AccountData implements Serializable {
	/**
	 * Class stores, retrieves and modifies bank account data for this program.
	 */
	private static final long serialVersionUID = 1735758963740673461L;
	private static String filename = "./AccountData.txt";
	private static List<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public AccountData() {
	}
	
	public static List<BankAccount> getAccountList() {
		return accounts;
	}
	
	public static void addAccount(BankAccount acct) {
		accounts.add(acct);
	}
	
	public static String getFilename() {
		return filename;
	}
	
	public static Boolean matchAccount(long l) {
		for (BankAccount acct : accounts) {
			if (l == acct.getAccountNumber()) {
				return true;
			}
		}
		return false;
	}
	
	public static BankAccount getAccount(long l) {
		for (BankAccount acct : accounts ) {
			if (l == acct.getAccountNumber()) {
				return acct;
			}
		}
		return null;
	}
	
	public static void printAccountList() {
		for (BankAccount acct : accounts) {
			System.out.println(acct);
		}	
	}
	
	public static void writeAccount(String filename, List<BankAccount> li) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(li);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readAccount(String filename) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			accounts = (List<BankAccount>)ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
