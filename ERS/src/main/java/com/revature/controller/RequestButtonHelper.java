package com.revature.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestButtonHelper {

	public static String process(HttpServletRequest request, HttpServletResponse response) {

		switch (request.getRequestURI()) {

		case "/ERS/Main.do":
			return MainPage.Register(request);
		
		case "/ERS/html/Login.do":
			return LoginButtonController.Login(request);

/*		 case "/ERS/html/Register.do":
		 return RegisterButtonController.Register(request);
			
		case "/ERS/Register.do":
			return RegisterController.Register(request);
			
		case "/ERS/html/Home.do":
			return HomeController.PetJSON(request, response);	
		
		
*/			
		default:
			return "/html/Main.html";
		}

	}

}
