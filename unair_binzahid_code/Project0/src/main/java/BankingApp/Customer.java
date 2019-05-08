package BankingApp;

public class Customer {
		
	private String fName, lName, uName, pass;

	@Override
	public String toString() {
		return "Customer [FirstName: " + fName + ", Last Name: " + lName + ", "
				+ "Username: " + uName + ", password: " + pass + "]";
	}
	
	public Customer() {
		
	}

	public Customer(String fName, String lName, String uName, String pass) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.pass = pass;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

	

} 
