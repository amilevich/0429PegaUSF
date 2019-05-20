package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.ExpenseTicket;

public class ExpenseTicketDaoImpl implements ExpenseTicketDao {
	static{

	       try {

	           Class.forName("oracle.jdbc.driver.OracleDriver");

	       } catch (ClassNotFoundException e) {

	           e.printStackTrace();

	       }

	   }
	
	public static final String TABLE = "expensekit";
	private static String url = "jdbc:oracle:thin:@orcl.cncthujmniwo.us-east-1.rds.amazonaws.com:1521:orcl";
	private static String username = "project1";
	private static String password = "password1";

	@Override
	public void insertExpenseTicket(ExpenseTicket exp) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			int id=0;
			PreparedStatement ps = conn.prepareStatement("INSERT INTO expensekit VALUES(?,?,?,?,?,?,?,?,?)");

			
			ps.setString(1, null);
			ps.setInt(2, exp.getId_employee());
			ps.setDouble(3,exp.getAmount_e_t());
			ps.setDate(4,  java.sql.Date.valueOf(exp.getSub_date_e_t()));
			ps.setDate(5, java.sql.Date.valueOf(exp.getRes_date_e_t()));
			ps.setInt(6, exp.getStatus_e_t());
			ps.setString(7, exp.getDescription_e_t());
			ps.setInt(8, exp.getReq_e_t());
			ps.setInt(9, exp.getType_e_t());		
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ExpenseTicket selectExpenseTicket(int name) {
		ExpenseTicket ExpenseT = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			//String sql = String.format("SELECT * FROM %s  WHERE e_username=?", TABLE);

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM expensekit WHERE e_username=?");
			ps.setInt(1, name);
		
			ResultSet rs = ps.executeQuery();

			while (rs.next()){
				ExpenseT = new ExpenseTicket(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getInt(8),rs.getInt(9));
				};

			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ExpenseT;
		
	}
	@Override
	public ExpenseTicket selectExpenseTicket() {
		ExpenseTicket ExpenseT = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			//String sql = String.format("SELECT * FROM %s  WHERE e_username=?", TABLE);

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM expensekit");
			
		
			ResultSet rs = ps.executeQuery();

			while (rs.next()){
				ExpenseT = new ExpenseTicket(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getInt(8),rs.getInt(9));
				};

			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ExpenseT;
		
	}

	@Override
	public void updateExpenseTicket(int idT,int statusT) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String query = "update expensekit set t_status = ? where t_id = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, statusT);
			ps.setInt(2, idT);
			
		
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
	}

	@Override
	public void deleteExpenseTicket(ExpenseTicket exp) {
		// TODO Auto-generated method stub
		
	}

	
}
