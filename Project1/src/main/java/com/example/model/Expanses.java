package com.example.model;

public class Expanses {
	public double amount;
	public String extype, comments;
	
	
	
	
	public Expanses() {
		super();
	}
	public Expanses(double amount, String extype, String comments) {
		super();
		this.amount = amount;
		this.extype = extype;
		this.comments = comments;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getExtype() {
		return extype;
	}
	public void setExtype(String extype) {
		this.extype = extype;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Expanses [amount=" + amount + ", Extype=" + extype + ", comments=" + comments + "]";
	}

}
