package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.PetDaoImpl;
import com.example.model.Pet;

public class LoginController {

	public static String Login(HttpServletRequest request) {

		String username1 = request.getParameter("username");
		String password1 = request.getParameter("password");

		PetDaoImpl pdImpl = new PetDaoImpl();
		Pet p = new Pet();
		p = pdImpl.selectPetByName(username1);

		if (username1.equals(p.getUsername1()) & password1.equals(p.getPassword1())) {

			return "/html/EmployeeHome.html";
		}

		return "/html/Login.html";

	}

}
