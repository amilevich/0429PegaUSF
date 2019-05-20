package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		switch(request.getRequestURI()) {
		
		case "/Project1/html/Login.do":
			return LoginController.Login(request);
		case "/Project1/html/AdminHome.do":
			return AdminHomeController.EmployeeJSON(request, response);
		case "/Project1/html/NewExpense.do":
			return EmployeeHomeController.EmployeeJSON(request);
			
		case "/Project1/html/DenyAndApprove.do":
			return DenyAndApproveController.Login(request);
			
			
		default:
			return "/html/Login.html";
		}
		
	}
}
