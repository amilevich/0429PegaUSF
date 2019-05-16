package com.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Pet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HomeController {

	public static String PetJSON(HttpServletRequest request, HttpServletResponse response) {
		Pet p = (Pet)request.getSession().getAttribute("Pet");
		
		try {
			response.getWriter().write(new ObjectMapper().writeValueAsString(p));
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
