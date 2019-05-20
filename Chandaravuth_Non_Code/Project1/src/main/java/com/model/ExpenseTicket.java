package com.model;

public class ExpenseTicket {

	private int id_e_t;
	private int id_employee;
	private double amount_e_t;
	private String sub_date_e_t;
	private String res_date_e_t;
	private int status_e_t;
	private String description_e_t;
	private int req_e_t;
	private int type_e_t;

	
	
	
	public ExpenseTicket() {
		
	}

	public ExpenseTicket(int id_employee, double amount_e_t, String sub_date_e_t, String res_date_e_t,
		int status_e_t, String description_e_t, int req_e_t, int type_e_t) {
		this.id_employee = id_employee;
		this.amount_e_t = amount_e_t;
		this.sub_date_e_t = sub_date_e_t;
		this.res_date_e_t = res_date_e_t;
		this.status_e_t = status_e_t;
		this.description_e_t = description_e_t;
		this.req_e_t = req_e_t;
		this.type_e_t = type_e_t;
	}

	public ExpenseTicket(int id_e_t, int id_employee, double amount_e_t, String sub_date_e_t, String res_date_e_t,
			int status_e_t, String description_e_t, int req_e_t, int type_e_t) {
		super();
		this.id_e_t = id_e_t;
		this.id_employee = id_employee;
		this.amount_e_t = amount_e_t;
		this.sub_date_e_t = sub_date_e_t;
		this.res_date_e_t = res_date_e_t;
		this.status_e_t = status_e_t;
		this.description_e_t = description_e_t;
		this.req_e_t = req_e_t;
		this.type_e_t = type_e_t;
	}



	public int getId_e_t() {
		return id_e_t;
	}



	public void setId_e_t(int id_e_t) {
		this.id_e_t = id_e_t;
	}



	public int getId_employee() {
		return id_employee;
	}



	public void setId_employee(int id_employee) {
		this.id_employee = id_employee;
	}



	public double getAmount_e_t() {
		return amount_e_t;
	}



	public void setAmount_e_t(double amount_e_t) {
		this.amount_e_t = amount_e_t;
	}



	public String getSub_date_e_t() {
		return sub_date_e_t;
	}



	public void setSub_date_e_t(String sub_date_e_t) {
		this.sub_date_e_t = sub_date_e_t;
	}



	public String getRes_date_e_t() {
		return res_date_e_t;
	}



	public void setRes_date_e_t(String res_date_e_t) {
		this.res_date_e_t = res_date_e_t;
	}



	public int getStatus_e_t() {
		return status_e_t;
	}



	public void setStatus_e_t(int status_e_t) {
		this.status_e_t = status_e_t;
	}



	public String getDescription_e_t() {
		return description_e_t;
	}



	public void setDescription_e_t(String description_e_t) {
		this.description_e_t = description_e_t;
	}



	public int getReq_e_t() {
		return req_e_t;
	}



	public void setReq_e_t(int req_e_t) {
		this.req_e_t = req_e_t;
	}



	public int getType_e_t() {
		return type_e_t;
	}



	public void setType_e_t(int type_e_t) {
		this.type_e_t = type_e_t;
	}



	@Override
	public String toString() {
		return "ExpenseTicket [id_e_t=" + id_e_t + ", id_employee=" + id_employee + ", amount_e_t=" + amount_e_t
				+ ", sub_date_e_t=" + sub_date_e_t + ", res_date_e_t=" + res_date_e_t + ", status_e_t=" + status_e_t
				+ ", description_e_t=" + description_e_t + ", req_e_t=" + req_e_t + ", type_e_t=" + type_e_t + "]";
	}

}
