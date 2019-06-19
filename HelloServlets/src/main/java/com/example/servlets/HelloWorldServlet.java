package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		String message = "Hello World, peoples";
		PrintWriter pWriter = response.getWriter();
		pWriter.write("<h1>Daily message is: " + message + "</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		//forward
		//request.getRequestDispatcher("Home.html").forward(request, response);
		//redirect
		response.sendRedirect("https://media.giphy.com/media/26FPCXdkvDbKBbgOI/giphy.gif");
			}
	}

