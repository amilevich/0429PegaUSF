package com.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RequestHelper {
	
public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		switch(request.getRequestURI()) {
		
		case "/0429ProjectOne/html/Login.do":
			return LoginController.login(request);
 		case "/0429ProjectOne/html/NewExpense.do":
 			return EmployeeController.newExpense(request);
		case "/0429ProjectOne/html/Admin.do":
		    return AdminController.loadTickets(request, response);
		default:
			return "/html/Login.html";
		}
	}
}
