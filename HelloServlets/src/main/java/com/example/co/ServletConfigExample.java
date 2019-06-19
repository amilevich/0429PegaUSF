package com.example.co;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class ServletConfigExample extends HttpServlet{
	
	@Override
	public void init() throws ServletException{
		System.out.println("ServletConfigExample");
		
		String firstVal = getInitParameter("favoriteColor");
		String secondVal = getInitParameter("numberOfLegs");
		System.out.println("\tFirst value: " + firstVal);
		System.out.println("\tSecond value: " + secondVal);
	}

}
