package Project0_Banking_Application.Project0_Banking_Application;

public class Account {
	
	private String accountnumber;
	private String accountype;
	private String customername;
	private double amount;
	private double balance;
	private int idAccount;

	
	public Account()
	{
		
	}

	public Account(String accountnumber, String accountype, String customername, double balance,int idAccount) {
		super();
		this.accountnumber = accountnumber;
		this.accountype = accountype;
		this.customername = customername;
		this.balance = balance;
		this.idAccount = idAccount;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccountype() {
		return accountype;
	}

	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	@Override
	public String toString() {
		return ""+idAccount+":"+customername+":"+accountype+":"+accountnumber+":"+balance+"";
	}





	

}
