package com.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import com.dao.TicketDaoImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Ticket;

public class AdminController {
	
	public static String loadTickets(HttpServletRequest request, HttpServletResponse response) {
		TicketDaoImpl tImpl = new TicketDaoImpl();
		List<Ticket> tList = tImpl.selectAllTickets();
		ObjectMapper obj = new ObjectMapper();
		
		try {
			String jsonStr = obj.writeValueAsString(tList);
			response.getWriter().write(jsonStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "/0429ProjectOne/html/Admin.do";
	}
	
	
	
}
