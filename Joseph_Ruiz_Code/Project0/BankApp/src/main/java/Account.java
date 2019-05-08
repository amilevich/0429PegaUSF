import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Account implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5246896780809992169L;
	private static final Logger logger = LogManager.getLogger();
	private long accountNumber;
	private double balance;
	private String owner;
	
	public Account(long accountNumber, String owner) {
		super();
		this.accountNumber = accountNumber;
		this.owner = owner;
	}
	
	protected boolean withdraw(double amount) {
		if (amount > balance) {
			// Overdrawing is bad
			System.out.println("Overdraw not allowed");
			logger.warn("Account " + this.accountNumber + ": Attempted overdraw");
			return false;
		} else if (amount < 0) {
			// Negative amounts are bad too
			System.out.println("Negative amount not allowed");
			logger.warn("Account " + this.accountNumber + ": Attempted negative withdraw");
			return false;
		} else {
			// OK
			balance = balance - amount;
			logger.info("Account " + this.accountNumber + ": withdraw $" + amount);
			return true;
		}
	}

	protected boolean deposit(double amount) {
		if (amount < 0) {
			// Negative amounts are bad
			System.out.println("Negative amount not allowed");
			logger.warn("Account " + this.accountNumber + ": Attempted negative deposit");
			return false;
		} else {
			// OK
			balance = balance + amount;
			logger.info("Account " + this.accountNumber + ": deposit $" + amount);
			return true;
		}
	}
	
	protected boolean transfer(double amt, Account a) {
		if (a.getAccountNumber() == this.getAccountNumber()) {
			System.out.println("Same account number as current account");
			return false;
		}
		boolean b;
		b = this.withdraw(amt);
		if (b) {
			a.deposit(amt);
			logger.info("Account " + this.accountNumber + ": transfer $" + amt + " to Account " + a.getAccountNumber());
		}
		return b;
	}
	
	protected long getAccountNumber() {
		return accountNumber;
	}

	protected double getBalance() {
		return balance;
	}

	protected String getOwner() {
		return owner;
	}
	
}
