package com.example.model;

public class Pet {
	public int userid;
	public String fname, lname, username1, password1;
	
	public Pet() {
	}

	
	public Pet( String fname, String lname, String username1, String password1,int userid) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.username1 = username1;
		this.password1 = password1;
	}


	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername1() {
		return username1;
	}

	public void setUsername1(String username1) {
		this.username1 = username1;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	@Override
	public String toString() {
		return "Pet [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", username1=" + username1
				+ ", password1=" + password1 + "]";
	}

	

}
