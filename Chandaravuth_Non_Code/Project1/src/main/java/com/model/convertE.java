package com.model;

public class convertE {
	private String id_emp;
	private String username;
	private String firstname;
	private String lastname;
	private String position;
	private String password;
	private String exp_type;
	private String exp_amount;
	private String exp_Date_s;
	private String exp_Date_r;
	private String exp_s;
	private String exp_description;
	private String exp_T_id;
	private String checkStatus;
	
	
	public convertE() {
		// TODO Auto-generated constructor stub
	}
	public convertE(String id_emp,String firstname, String lastname, String exp_type,String exp_amount,String exp_Date_s
			,String exp_Date_r, String exp_s, String exp_description, String exp_T_id, String checkStatus) {
		this.id_emp=id_emp;
		this.firstname=firstname;
		this.lastname=lastname;
		this.exp_type=exp_type;
		this.exp_amount=exp_amount;
		this.exp_Date_s=exp_Date_s;
		this.exp_Date_r=exp_Date_r;
		this.exp_s=exp_s;
		this.exp_description=exp_description;
		this.exp_T_id=exp_T_id;
		this.checkStatus=checkStatus;
	}
	
	public convertE(String id_emp,String firstname, String lastname, String exp_type,String exp_amount,String exp_Date_s
			,String exp_Date_r, String exp_s, String exp_description, String exp_T_id) {
		this.id_emp=id_emp;
		this.firstname=firstname;
		this.lastname=lastname;
		this.exp_type=exp_type;
		this.exp_amount=exp_amount;
		this.exp_Date_s=exp_Date_s;
		this.exp_Date_r=exp_Date_r;
		this.exp_s=exp_s;
		this.exp_description=exp_description;
		this.exp_T_id=exp_T_id;

	}

	public convertE(String id_emp, String username, String firstname, String lastname, String position,
			String password) {
		super();
		this.id_emp = id_emp;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
		this.password = password;
	}

	public String getId_emp() {
		return id_emp;
	}

	public void setId_emp(String id_emp) {
		this.id_emp = id_emp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getExp_type() {
		return exp_type;
	}

	public void setExp_type(String exp_type) {
		this.exp_type = exp_type;
	}

	public String getExp_amount() {
		return exp_amount;
	}

	public void setExp_amount(String exp_amount) {
		this.exp_amount = exp_amount;
	}

	public String getExp_Date_s() {
		return exp_Date_s;
	}

	public void setExp_Date_s(String exp_Date_s) {
		this.exp_Date_s = exp_Date_s;
	}

	public String getExp_Date_r() {
		return exp_Date_r;
	}

	public void setExp_Date_r(String exp_Date_r) {
		this.exp_Date_r = exp_Date_r;
	}

	public String getExp_s() {
		return exp_s;
	}

	public void setExp_s(String exp_s) {
		this.exp_s = exp_s;
	}

	public String getExp_description() {
		return exp_description;
	}

	public void setExp_description(String exp_description) {
		this.exp_description = exp_description;
	}

	public String getExp_T_id() {
		return exp_T_id;
	}

	public void setExp_T_id(String exp_T_id) {
		this.exp_T_id = exp_T_id;
	}
	

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	@Override
	public String toString() {
		return "convertE [id_emp=" + id_emp + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", position=" + position + ", password=" + password + ", exp_type=" + exp_type
				+ ", exp_amount=" + exp_amount + ", exp_Date_s=" + exp_Date_s + ", exp_Date_r=" + exp_Date_r
				+ ", exp_s=" + exp_s + ", exp_description=" + exp_description + ", exp_T_id=" + exp_T_id
				+ ", checkStatus=" + checkStatus + "]";
	}

	
	
	
}


