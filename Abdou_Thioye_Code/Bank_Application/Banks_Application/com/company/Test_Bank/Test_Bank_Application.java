package com.company.Test_Bank;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.Bank.Account;
import com.company.Bank.BankApplication;
public class Test_Bank_Application {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	
	
static Test_Bank_Application bank = new Test_Bank_Application();
	
	

//	@Test
//	public void areTwoIntegersEqual(int i, int j) {
//		assertEquals("should return true", true, calc.areTwoIntegersEqual(4,4));
//		System.out.println("method to check the equality of two integers tested");
//	}
//	


	

	@Test
	public  void login() {
		//String[] person = scanForUser();
		//assertEquals("should return ", String, );
		System.out.println("method to check the equality of two integers tested");
	
	}
	
	
	@Test
	public static void menu() {
	
//		
//		IntegerAsker asker = mock(IntegerAsker.);
//	    when(asker.ask(anyString())).thenReturn(3);

//	    assertEquals(getBoundIntegerFromUser(asker), 3);
		
	}
	
	@Test
	public static void scanForUser() {
		
		
	}
	
	@Test
	public static Account gatheredData(Account data, int choice) throws IOException{
		return data;
		
	}
	
	@Test
	public static ArrayList<Account> FileIn() throws IOException{
		return null;
		
	}
	
	
	
	@After
	public void afterMethod() {
		System.out.println("**************after each method**************");
	}
	
}
