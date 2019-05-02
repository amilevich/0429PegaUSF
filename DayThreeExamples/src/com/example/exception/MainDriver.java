package com.example.exception;

public class MainDriver {
	
	public static void main(String[] args) {
		
		bankTransaction("Withdraw", 1);
		System.out.println("done");
		
	}
	
	public static void bankTransaction(String action, double amount) {
		if(action.equals("Withdraw")) {
			try {
				withdraw(amount);
			} catch (WithdrawTooBigException e) {
				e.printStackTrace();
			} catch(Exception s) {
				s.printStackTrace();
			}
			finally {
				System.out.println("****In finally block****");
				/*
				 * always executes 
				 */
			}
		}
	}
	
	
	public static void withdraw(double withdrawAmount) throws WithdrawTooBigException {
		
		double maxWithdrawAmount = 0;
		
		if( withdrawAmount > maxWithdrawAmount) {
			throw new WithdrawTooBigException(withdrawAmount + " exceeds"
					+ " the max withdraw limit of: " + maxWithdrawAmount);
		}
		
	}

}
