package com.revature.screens;

import java.util.Scanner;

//import org.apache.log4j.Logger;

import com.revature.beans.User;
import com.revature.daos.UserDao;
import com.revature.daos.UserSerializer;

public class WithdrawScreen implements Screen {
	private User current;
	
	private Scanner scan = new Scanner(System.in);
	private UserDao ud = UserDao.currentUserDao;
//	private Logger log = Logger.getRootLogger();
	boolean b = true;
	
	public WithdrawScreen(User currentUser) {
		this.current = currentUser;
	}

	@Override
	public Screen start() {
//		log.debug("withdraw screen started");
		while(b) {
			System.out.println("How much money would you like to withdraw?: ");
			double thisNum = scan.nextDouble();
			if(thisNum > ud.getBalance())
				System.out.println("Unable to withdraw this amount!");
			else {
				ud.withdrawYeet(thisNum);
				ud.addHistory("Withdrew " + thisNum + ", Balance = " + ud.getBalance() + "\n");
				UserSerializer.us.updateUser(current);
				b = false;
			}
		}
		return new HomeScreen(current);
	}

}
