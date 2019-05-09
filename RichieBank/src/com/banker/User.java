package com.banker;

import java.io.Serializable;

public class User implements Serializable {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	public User(){
		this(null, null, null, null);
	}
	
	public User(String username, String password, String firstName, String lastName) {
		setUsername(username);
	    setPassword(password);
	    setfirstName(firstName);
	    setlastName(lastName);
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
	
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

}
