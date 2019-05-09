package Project0_Banking_Application.Project0_Banking_Application;

import java.util.Arrays;

public class Customer {
	
	private String username;
	private StorePassword password;
	private String passwordc;
	private String firstname;
	private String lastname;
	private String accountnumber;
	private int idcustomer;
	

	
	
	public Customer() {
		
	}
	public Customer(String firstname, String lastname, int idcustomer,String accountnumber) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountnumber = accountnumber;
		this.idcustomer = idcustomer;
	}
/*	public Customer(String username, String passwordc, String firstname, String lastname 
			 ) {
		
		this.username = username;
		this.passwordc = passwordc;
		this.firstname = firstname;
		this.lastname = lastname;
		
	}*/
	public Customer(String username, String passwordc, String firstname, String lastname,String accountnumber) {
		
		this.username = username;
		this.passwordc = passwordc;
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountnumber=accountnumber;
		
	}

	public Customer(String username, String passwordc, String firstname, String lastname, String accountnumber,
			 int idcustomer) {
		
		this.username = username;
		this.passwordc = passwordc;
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountnumber = accountnumber;
		this.idcustomer = idcustomer;
	}
	
	public Customer(String username, StorePassword password, String firstname, String lastname, String accountnumber,
			 int idcustomer) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountnumber = accountnumber;
		this.idcustomer = idcustomer;
	}



	public void WithdrawAmount()
	{
		
	}
	
	public void DepositAmount()
	{
		
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public StorePassword getPassword() {
		return password;
	}

	public void setPassword(StorePassword password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	


	public String getPasswordc() {
		return passwordc;
	}


	public void setPasswordc(String passwordc) {
		this.passwordc = passwordc;
	}


	public int getIdcustomer() {
		return idcustomer;
	}


	public void setIdcustomer(int idcustomer) {
		this.idcustomer = idcustomer;
	}


/*	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", accountnumber=" + removeComma(accountnumber)+ 
				", idcustomer=" + idcustomer +"]";
	}*/
	@Override
	public String toString() {
		return ""+idcustomer+":"+firstname+":"+lastname+":"+username+":"+(accountnumber)+":"+passwordc+"";
	}


	public static String removeComma(int[] n)
	{
		String c ="";
		StringBuffer temp = new StringBuffer();
		for(int i=0;i<n.length;i++)
		{
			c =c.valueOf(n[i]);
			temp=temp.append(c);
			
		}
		return temp.toString();
		
	}




	
	
	

}
