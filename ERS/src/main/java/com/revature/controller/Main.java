/*package com.revature.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	public static String process(HttpServletRequest request, HttpServletResponse response) {
		
		switch(request.getRequestURI()) {
		
		case "/ERS/html/Login.do":
			return LoginController.Login(request);
			
		case "/ERS/Register.do":
			return RegisterController.Register(request);
			
		case "/ERS/html/Home.do":
			return HomeController.PetJSON(request, response);		
			
		default:
			return "/html/Login.html";
		}
		
	}

}*/