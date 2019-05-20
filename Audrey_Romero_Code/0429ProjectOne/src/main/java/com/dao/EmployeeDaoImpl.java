package com.dao;
import java.sql.*;
import java.util.*;
import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
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
	public void insertEmployee(Employee e) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO employees VALUES(?,?,?,?,?,?)");
			ps.setString(1, e.getUserId());
			ps.setString(2, e.getUsername());
			ps.setString(3, e.getPassword());
			ps.setString(4, e.getFirstName());
			ps.setString(5,  e.getLastName());
			ps.setString(6, e.getIsAdmin());
			ps.executeUpdate();
			
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

	@Override
	public Employee selectEmployee(String emp_username) {
        Employee e = null;
		
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employees WHERE username=?");
			ps.setString(1, emp_username);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				e = new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
			}
			
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		return e;
	}

	@Override
	public List<Employee> selectAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employees");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				employees.add(new Employee(rs.getString(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6)));
			}
			
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		return employees;
	}

	@Override
	public void updateEmployee(Employee e) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("UPDATE employees SET username=?, pass_word=?, "
					+ "first_name=?, last_name=? WHERE user_id=");
			ps.setString(1, e.getUsername());
			ps.setString(2, e.getPassword());
			ps.setString(3, e.getFirstName());
			ps.setString(4, e.getLastName());
			ps.setString(5, e.getUserId());
			ps.executeUpdate();
			
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(Employee e) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("DELETE FROM employees WHERE user_id=?");
			ps.setString(1, e.getUserId());
			ps.executeUpdate();
			
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}
	
}
