package com.project0;

import java.io.Serializable;

public class InformationObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String userID;
	private String userPassword;
	private Double userBalance;
	
	
	@Override
	public String toString() {
		return "InformationObject [userName=" + userName + ", userID=" + userID + ", userPassword=" + userPassword
				+ ", userBalance=" + userBalance + "]";
	}
	
	
	public InformationObject(String userName, String userID, String userPassword, Double userBalance) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.userPassword = userPassword;
		this.userBalance = userBalance;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Double getUserBalance() {
		return userBalance;
	}
	public void setUserBalance(Double userBalance) {
		this.userBalance = userBalance;
	}

}
