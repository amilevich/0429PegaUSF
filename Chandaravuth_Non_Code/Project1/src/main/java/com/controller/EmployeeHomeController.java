package com.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.dao.ExpenseTicketDaoImpl;
import com.model.ExpenseTicket;

public class EmployeeHomeController {
	
	public static String EmployeeJSON(HttpServletRequest request)
	{
		String  expenseType = request.getParameter("type");
		String amount = request.getParameter("Amount");
		String descrip = request.getParameter("Description");
		
		
		
		ExpenseTicketDaoImpl expImpl = new ExpenseTicketDaoImpl();
		ExpenseTicket expTicket = new ExpenseTicket();
		
		expTicket.setId_employee(LoginController.employeeId);
		expTicket.setReq_e_t(Integer.parseInt(expenseType));
		expTicket.setAmount_e_t(Double.parseDouble(amount));
		expTicket.setDescription_e_t(descrip);
		expTicket.setSub_date_e_t(CreateDate());
		expTicket.setRes_date_e_t(DataRe());
		expTicket.setStatus_e_t(3);
		expTicket.setType_e_t(5);
		
		
		
		
		expImpl.insertExpenseTicket(expTicket);
		
		
		return "/html/Login.html";
	}
	
	public static String CreateDate() {
		
		LocalDate localDate = LocalDate.now();
		String dt = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(dt));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.add(Calendar.DATE, 0);  // number of days to add
		dt = sdf.format(c.getTime());
		
		
		
		return dt;
		
	}
	public static String DataRe() {
		LocalDate localDate = LocalDate.now();
		String dt = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(dt));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.add(Calendar.DATE, 7);  // number of days to add
		dt = sdf.format(c.getTime());
		
		
		
		return dt;
		
	}
	
	
	
	
}
