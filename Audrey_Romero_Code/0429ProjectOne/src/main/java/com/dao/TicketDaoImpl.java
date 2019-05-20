package com.dao;
import java.sql.*;
import java.util.*;
import com.model.Ticket;

public class TicketDaoImpl implements TicketDao {
	static{
		
	       try {
	           Class.forName("oracle.jdbc.driver.OracleDriver");
	       } catch (ClassNotFoundException e) {
	           e.printStackTrace();
	       }

	   }
	
	private static String url = "jdbc:oracle:thin:@sqldb.c7ten2shxrsc.us-east-2.rds.amazonaws.com:1521:sqldb";
	private static String username = "audrey";
	private static String password = "passw0rd";
	
	@Override
	public void insertTicket(Ticket t) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO tickets VALUES(?,?,?,?,?,?,?,?)");
			ps.setString(1, t.getTicketId());
			ps.setString(2, t.getTicketType());
			ps.setString(3, t.getAmount());
			ps.setString(4, t.getDateSubmitted());
			ps.setString(5,  t.getDateResolved());
			ps.setString(6,  t.getStatus());
			ps.setString(7,  t.getDescription());
			ps.setString(8, t.getUserId());
			ps.executeUpdate();
			
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

	@Override
	public Ticket selectTicket(int ticketId) {
//        Ticket t = null;
//		
//		try (Connection conn = DriverManager.getConnection(url, username, password)) {
//			PreparedStatement ps = conn.prepareStatement("SELECT * FROM tickets WHERE ticket_id=?");
//			ps.setInt(1, ticketId);
//			ResultSet rs = ps.executeQuery();
//			
//			while(rs.next()) {
//				t = new Ticket(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
//						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
//			}
//			
//		} catch (SQLException exc) {
//			exc.printStackTrace();
//		}
		return null;
	}

	@Override
	public List<Ticket> selectAllTickets() {
		List<Ticket> tickets = new ArrayList<Ticket>();
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM tickets LEFT JOIN employees " + 
					                                     "ON tickets.user_id = employees.user_id");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				tickets.add(new Ticket(rs.getString(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(12), rs.getString(13)));
			}
			
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		return tickets;
	}

	@Override
	public void updateTicket(Ticket t) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("UPDATE tickets SET ticket_type=?, amount=?, "
					+ "submitted=?, resolved=?, status=?, emp_desc=? WHERE ticket_id=?");
			ps.setString(1, t.getTicketType());
			ps.setString(2, t.getAmount());
			ps.setString(3, t.getDateSubmitted());
			ps.setString(4, t.getDateResolved());
			ps.setString(5, t.getStatus());
			ps.setString(6, t.getDescription());
			ps.setString(7, t.getTicketId());
			ps.executeUpdate();
			
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		
	}

	@Override
	public void deleteTicket(Ticket t) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("DELETE FROM tickets WHERE ticket_id=?");
			ps.setString(1, t.getTicketId());
			ps.executeUpdate();
			
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

}
