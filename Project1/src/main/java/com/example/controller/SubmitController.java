package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.ExpDaoImpl;
import com.example.model.Expanses;


public class SubmitController {
	
public static String Submit(HttpServletRequest request) {
		
		String extype = request.getParameter("extype");
		String comments = request.getParameter("comments");
		Double amount = Double.parseDouble(request.getParameter("amount"));
		
		
//		int amount = request.getParameter();
		
		Expanses expanse = new Expanses();
		expanse.setAmount(amount);
		expanse.setExtype(extype);
		expanse.setComments(comments);
		
		
		ExpDaoImpl pdImpl = new ExpDaoImpl();
		pdImpl.submitExp(expanse);
		
		return "/html/EmployeeHome.html";
		
	}

}
