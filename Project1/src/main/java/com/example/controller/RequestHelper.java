package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	public static String process(HttpServletRequest request, HttpServletResponse response) {

		switch (request.getRequestURI()) {

		case "Project1/html/Login.do":
			return LoginController.Login(request);

		case "PetsFrontController/html/Register.do":
			return RegisterController.Register(request);

		case "/Project1/html/EmployeeHome.do":
			return SubmitController.Submit(request);

//		case "/Project1/html/AdminHome.do":
//			return RetrieveController.Retrieve(request);

		case "Project1/html/AdminHome.do":
			return HomeController.PetJSON(request, response);

		default:
			return "/html/Login.html";
		}

	}

}
