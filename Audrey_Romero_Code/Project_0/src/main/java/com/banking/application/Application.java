package com.banking.application;
import com.banking.prompt.*;
import com.banking.user.UserData;
/**
 * This program demonstrates a simple banking application. Users can create new bank accounts,
 * withdraw funds, deposit funds, and transfer funds. Administrative users also exist and have
 * additional permissions including approving new account requests, viewing and editing
 * customer and account data, and closing accounts.
 * @author Audrey Romero
 *
 */
public class Application {

	public static void main(String[] args) {	

		System.out.println("Welcome to Audrey's Banking App! (alpha 0.1.0)");
		
		UserData.readUser(UserData.getFilename());
		
		Prompts.login();
				
	}

}
