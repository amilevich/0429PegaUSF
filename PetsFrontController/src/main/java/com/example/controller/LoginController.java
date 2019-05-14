package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.PetDaoImpl;
import com.example.model.Pet;

public class LoginController {
	
	public static String Login(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		
		PetDaoImpl pdImpl = new PetDaoImpl();
		Pet p = new Pet();
		p = pdImpl.selectPetByName(name);
		
		if(name.equals(p.getName()) & type.equals(p.getType())) {
			
			return "/html/Home.html";
		}
		
		return "/html/Login.html";
		
	}

}
