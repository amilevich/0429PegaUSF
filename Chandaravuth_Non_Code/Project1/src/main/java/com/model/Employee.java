package com.model;

public class Employee {
	
	private int id_emp;
	private String username;
	private String firstname;
	private String lastname;
	private String position;
	private String password;
	
	public Employee() {
		
	}
	public Employee(String firstname) {
		
	
		this.firstname = firstname;
	
	}
	public Employee(String firstname, String lastname) {
		
		
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	
	public Employee(String username, String firstname, String lastname, String position, String password) {
	
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
		this.password = password;
	}

	public Employee(int id_emp, String username, String firstname, String lastname, String position, String password) {
		super();
		this.id_emp = id_emp;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
		this.password = password;
	}





	public int getId_emp() {
		return id_emp;
	}

	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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



	@Override
	public String toString() {
		return "Employee [id_emp=" + String.valueOf(id_emp) + ", username=" + username + ", password=" + password + ", position="
				+ position + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
