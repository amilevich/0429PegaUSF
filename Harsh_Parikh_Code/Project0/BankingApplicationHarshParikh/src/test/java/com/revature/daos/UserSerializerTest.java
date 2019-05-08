package com.revature.daos;
import com.revature.screens.RegisterUserScreen;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.revature.beans.User;

public class UserSerializerTest {
	
	RegisterUserScreen mockUS = new RegisterUserScreen();
	
	private static User user1;
	private static User user2;
	private static User user3;

	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();	
	
	@BeforeClass
	public static void setUp() {
		user1 = new User("user1", "0123456789", "test", "test", 1, 0, "");
		user2 = new User("user2", "0123456789", "test", "test", 1, 100, "");
		user3 = new User("user3", "0123456789", "test", "test", 1, 0, "");
		System.out.println();
	}
//
//	@Test
//	public void testCreateUser() {		
//		Object user;
//		assertEquals(true, mockUS.createUser(user));
//	}

//	@Test
//	public void testFindByUsernameAndPassword() {
//		System.out.println(user);
//		String username = "test";
//		String password = "0123456789";
//		User aUser = mockUS.findByUsernameAndPassword(username, password);
//		
//		mockUS.findByUsernameAndPassword(username, password);
//		assertTrue(user == aUser);
//		assertTrue("test".equals(aUser.getUsername()));
//		assertTrue("0123456789".equals(aUser.getPassword()));
//	}

//	@Test
//	public void testGetCurrentUser() {
//		User aUser = mockUS.getCurrentUser();
//		assertNotNull(aUser);
//	}
//
//	@Test
//	public void testUpdateUser() {
//		Object user;
//		mockUS.updateUser(user);
//		boolean test;
//		assertTrue("Update user failed", test == true);
//	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDepositYeet() {
		double balance = 0;
		double deposit1 = 50;
		double deposit2 = 1000;
		double deposit3 = 0;
		
		user1.depositYeet(deposit1);
		assertTrue(balance + deposit1 == user1.getBalance());
		
		user1.depositYeet(deposit2);
		assertTrue(balance + deposit1 + deposit2 == user1.getBalance());
		
		user1.depositYeet(deposit3);
		assertTrue(balance + deposit1 + deposit2 + deposit3 == user1.getBalance());
		
	}

	@Test
	public void testWithdrawYeet() {
		double balance = 100;
		double withdraw1 = 50;
		double withdraw2 = 0;
		
		user2.withdrawYeet(withdraw1);
		System.out.println(user2.getBalance());
		assertTrue(balance - withdraw1 == user2.getBalance());
		
	}

	@Test
	public void testAddHistory() {
		String history = "sample transaction";
		user3.addHistory(history);
		assertTrue(history.equals(user3.getHistory()));
	}

}
