package com.banking.user;
import java.io.Serializable;

public abstract class User implements Serializable{
	/**
	 * Class partially defines all users and their fields. Child classes Admin and Customer define
	 * actions users can and cannot do.
	 */
	private static final long serialVersionUID = -42561276702169858L;
	private String username, password, name;
	
	public User() {
		
	}

	public User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + "]";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFilename(String file) {
		return file;
	}

}
