package com.example.co;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class ServletContextExample extends HttpServlet{
	
	@Override
	public void init() throws ServletException{
		System.out.println("ServletContextExample");
		String firstValue = getServletContext().getInitParameter("databaseUrl");
		System.out.println("\tFirst value: " + firstValue);
	}

}
