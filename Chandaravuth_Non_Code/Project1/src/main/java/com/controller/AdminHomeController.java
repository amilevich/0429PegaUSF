package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Employee;
import com.model.convertE;

public class AdminHomeController {
	
	public static String EmployeeJSON(HttpServletRequest request, HttpServletResponse response) {
		//convertE p = (convertE) request.getSession().getAttribute("convertE");
		ArrayList<String> a = (ArrayList<String>) request.getSession().getAttribute("addALL");
		
		
		
	//	String[] nameArr = new String[a.size()];
	//	nameArr = a.toArray(nameArr);
		/*convertE convert = new convertE(String.valueOf(p.getId_emp()),p.getUsername(),p.getFirstname()
							,p.getLastname(),p.getPosition(),p.getPassword());*/
		//ExpenseTicket et = (ExpenseTicket)request.getSession().getAttribute("et");
		
		try {
			response.getWriter().write(new ObjectMapper().writeValueAsString(a));
			//response.getWriter().write(new ObjectMapper().writeValueAsString(p));
			//response.getWriter().write(new ObjectMapper().writeValueAsString(et));
			/*
			 * Marshalling is the process of transforming memory representation of an 
			 * object to a data forma suitable for storage or transmission.
			 * Object -> JSON
			 * 
			 * Unmarshalling - JSON -> Object
			 * 
			 * Marshalling tool we are using is Jackson
			 */
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

}
}
