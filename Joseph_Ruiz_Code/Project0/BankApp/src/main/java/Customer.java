import java.util.ArrayList;

public class Customer extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2442255954420313741L;
	private String firstName, lastName;
	private ArrayList<Long> accounts; // store the account numbers NOT the actual accounts

	public Customer(String firstName, String lastName, String userName, String password) {
		super(userName, password);
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new ArrayList<Long>();
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected ArrayList<Long> getAccounts() {
		return accounts;
	}

}
