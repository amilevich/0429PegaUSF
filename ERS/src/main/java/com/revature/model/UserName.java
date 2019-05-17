package com.revature.model;

public class UserName {

	String uname, pword;

	public UserName() {
	}

	public String getName() {
		return uname;
	}

	public void setName(String uname) {
		this.uname = uname;
	}

	public String getType() {
		return pword;
	}

	public void setType(String pword) {
		this.pword = pword;
	}

	public UserName(String uname, String pword) {
		super();
		this.uname = uname;
		this.pword = pword;
	}
}
