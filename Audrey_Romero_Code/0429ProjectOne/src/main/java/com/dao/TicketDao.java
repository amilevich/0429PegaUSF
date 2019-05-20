package com.dao;
import java.util.List;
import com.model.Ticket;

public interface TicketDao {

	// Create
	public void insertTicket(Ticket t);
	
	// Read
	public Ticket selectTicket(int ticketId); // Seems to be best field to use.
	public List<Ticket> selectAllTickets();
	
	// Update
	public void updateTicket(Ticket t);
	
	// Delete
	public void deleteTicket(Ticket t);
}
