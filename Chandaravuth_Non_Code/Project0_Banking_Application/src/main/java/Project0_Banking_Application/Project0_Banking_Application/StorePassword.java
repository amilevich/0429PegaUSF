package Project0_Banking_Application.Project0_Banking_Application;

import java.io.Serializable;

public class StorePassword implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7094989169110603389L;
	
	String password;
	int idpassword;
	public StorePassword() {
		
	}
	
	
	
	public StorePassword(String password,int idpassword) {
		super();
		this.password = password;
		this.idpassword = idpassword;
	}
	
	public StorePassword(String password)
	{
		this.password = password;
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

	public int getIdpassword() {
		return idpassword;
	}


	public void setIdpassword(int idpassword) {
		this.idpassword = idpassword;
	}


	@Override
	public String toString() {
		return ""+idpassword+":"+password+"";
	}



	
	

}
