package com.project0;

import java.util.Scanner;

public class AdminMain {


	private static Scanner myObj2;
	private static Scanner myObj;

	public static void main(String[] args) {
		
	// Introduction - Welcome Page 
		System.out.println("Welcome to ABCDEF Bank");
		System.out.println("*******************************************");
		System.out.println("Press 1 - View All Accounts");
		System.out.println("*******************************************");
		myObj = new Scanner(System.in);
		int key1 = myObj.nextInt();
		WriterReader.writerReader();
		int y=0;
		while (y<5) {
			AdminPage.menu();
			myObj2 = new Scanner(System.in);
			y = myObj2.nextInt();
			AdminPage.customerMenu(y);
		}


	}

}
