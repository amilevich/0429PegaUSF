package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Employee;



public class EmployeeDaoImpl implements EmployeeDao {
	
	static{

	       try {

	           Class.forName("oracle.jdbc.driver.OracleDriver");

	       } catch (ClassNotFoundException e) {

	           e.printStackTrace();

	       }

	   }

	public static final String TABLE = "employees";
	private static String url = "jdbc:oracle:thin:@orcl.cncthujmniwo.us-east-1.rds.amazonaws.com:1521:orcl";
	private static String username = "project1";
	private static String password = "password1";

	@Override
	public void insertEmployee(Employee exp) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String sql = String.format("INSERT INTO %s  VALUES(?,?,?,?,?,?)", TABLE);
			PreparedStatement ps = conn.prepareStatement(sql);
			int i = 0;
			ps.setString(++i, null);
			ps.setString(++i, exp.getUsername());
			ps.setString(++i, exp.getFirstname());
			ps.setString(++i, exp.getLastname());
			ps.setString(++i, exp.getPosition());
			ps.setString(++i, exp.getPassword());
			ps.executeUpdate();
			// exp.setId_emp(getMaxId(TABLE));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Employee selectEmployee(String name) {
		Employee employee = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			//String sql = String.format("SELECT * FROM %s  WHERE e_username=?", TABLE);

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employees WHERE e_username=?");
			ps.setString(1, name);
		
			ResultSet rs = ps.executeQuery();

			while (rs.next()){
					employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6));
				};

			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}
	
	@Override
	public Employee selectEmployee1() {
		Employee employee = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			//String sql = String.format("SELECT * FROM %s  WHERE e_username=?", TABLE);

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employees");
			
		
			ResultSet rs = ps.executeQuery();

			while (rs.next()){
				employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
				};

			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}


	@Override
	public void updateEmployee(Employee exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Employee exp) {
		// TODO Auto-generated method stub
		
	}

}
