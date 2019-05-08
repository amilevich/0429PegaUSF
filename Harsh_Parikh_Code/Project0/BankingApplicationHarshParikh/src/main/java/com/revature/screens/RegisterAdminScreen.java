package com.revature.screens;

import java.util.Scanner;

import com.revature.beans.Admin;
import com.revature.daos.AdminDao;

public class RegisterAdminScreen implements Screen {
	
	private Scanner scan = new Scanner(System.in);
	private AdminDao ad = AdminDao.currentAdminDao;

	@Override
	public Screen start() {
		// TODO Auto-generated method stub
		Admin a = new Admin();
		System.out.println("Enter new username");
		a.setUsername(scan.nextLine());
		System.out.println("Enter password");
		a.setPassword(scan.nextLine());
		System.out.println("Enter first name");
		a.setFirstName(scan.nextLine());
		System.out.println("Enter last name");
		a.setLastName(scan.nextLine());
		
		ad.createAdmin(a);
		
		return new AdminHomeScreen(a);
	}

}
