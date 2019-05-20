package com.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;


public class LoginController {
	protected static HttpSession session;
	
	public static String login(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		EmployeeDaoImpl eImpl = new EmployeeDaoImpl();
		Employee e = new Employee();
		e = eImpl.selectEmployee(username);
		
		session = request.getSession();
		session.setAttribute("user", e);
		
		if(username.equals(e.getUsername()) & password.equals(e.getPassword())) {
			if(e.getIsAdmin().equals("Y")) {
				return "/html/AdminHome.html";
			} else {
				return "/html/EmployeeHome.html";
			}
		}
		
		return "/html/Login.html";
		
	}
}
