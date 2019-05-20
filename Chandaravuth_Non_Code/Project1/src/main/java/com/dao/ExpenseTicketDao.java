package com.dao;

import com.model.ExpenseTicket;

public interface ExpenseTicketDao {

	// CREATE 
	public void insertExpenseTicket(ExpenseTicket exp);
	
	//READ
	public ExpenseTicket selectExpenseTicket(int name);
	//READ
	public ExpenseTicket selectExpenseTicket();
	
	// UPDATE
	public void updateExpenseTicket(int exp,int e);
	
	//DELETE
	public void deleteExpenseTicket(ExpenseTicket exp);
}
