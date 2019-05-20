package com.controller;

import javax.servlet.http.HttpServletRequest;

import com.dao.ExpenseTicketDaoImpl;

public class DenyAndApproveController {
	

	
	public static String Login(HttpServletRequest request) {
		String status = request.getParameter("a");
		int t_id =Character.getNumericValue(checkChar1(status));   
		int t_status =Character.getNumericValue(checkChar(status));   
		
		ExpenseTicketDaoImpl etd = new ExpenseTicketDaoImpl();
		etd.updateExpenseTicket(t_id, t_status);
		
		
		
		
		return "/html/Login.html";
	}
	
	public static char checkChar(String a) {
		char[] s=null;
				s= a.toCharArray();

		
		return s[0];
	
	}
	public static char checkChar1(String a) {
		char[] s=null;
				s= a.toCharArray();

		
		return s[1];
	
	}

}
