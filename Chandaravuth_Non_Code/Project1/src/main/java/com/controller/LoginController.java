package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.dao.EmployeeDaoImpl;
import com.model.Employee;
import com.model.convertE;

public class LoginController {
	static{

	       try {

	           Class.forName("oracle.jdbc.driver.OracleDriver");

	       } catch (ClassNotFoundException e) {

	           e.printStackTrace();

	       }

	   }
	public static int employeeId;
	public static final String TABLE = "employees";
	private static String urlDatabase = "jdbc:oracle:thin:@orcl.cncthujmniwo.us-east-1.rds.amazonaws.com:1521:orcl";
	private static String usernameDatabase = "project1";
	private static String passwordDatabase = "password1";
	
	static ArrayList<String> addALL = new ArrayList<String>();

	public static String Login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        EmployeeDaoImpl empImpl = new EmployeeDaoImpl();
        Employee emp = new Employee();
        emp= empImpl.selectEmployee(username);
        
  /*      EmployeeDaoImpl empImpl1 = new EmployeeDaoImpl();
        Employee emp1 = new Employee();
        emp1= empImpl1.selectEmployee1();*/
        
        
        if(username.equals(emp.getUsername()) & password.equals(emp.getPassword()))
		{

			 
			if("admin".equals(emp.getPosition()))
			{
	        	/*convertE convert = new convertE(String.valueOf(emp1.getId_emp()),emp1.getUsername(),emp1.getFirstname()
						,emp1.getLastname(),emp1.getPosition(),emp1.getPassword());*/
			
			//	request.getSession().setAttribute("convertE", convert);
				
				
				
				request.getSession().setAttribute("addALL", selectElementEmployee());
				return "/html/AdminHome.html";
			}
			if("employee".equals(emp.getPosition()))
			{
				employeeId=emp.getId_emp();
				
				return "/html/EmployeeHome.html";
			}
			
		}
       return "/html/Login.html";
    	
	}
	
	public static  ArrayList<convertE> selectElementEmployee() {
		ArrayList<convertE> conv = new ArrayList<convertE>();
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
/*		  ArrayList<String> empid = new ArrayList<String>();
		   ArrayList<String> empusername = new ArrayList<String>();
		  ArrayList<String> empfirstname = new ArrayList<String>();
		  ArrayList<String> emplastname = new ArrayList<String>();
		  ArrayList<String> emppostion = new ArrayList<String>();
		  ArrayList<String> emppassword = new ArrayList<String>();*/
		  
		try (Connection conn = DriverManager.getConnection(urlDatabase, usernameDatabase, passwordDatabase)) {
			//String sql = String.format("SELECT * FROM %s  WHERE e_username=?", TABLE);

			PreparedStatement ps = conn.prepareStatement("SELECT employees.e_id,employees.firstname,"
					+ "employees.lastname,expensekit.req_type,expensekit.exp_amount,expensekit.sub_date,"
					+ "expensekit.res_date,expensekit.t_status,expensekit.t_description,expensekit.t_id"
					+ " FROM employees,expensekit WHERE expensekit.e_id = employees.e_id AND employees.e_pos NOT IN 'admin' ");
			
		
			ResultSet rs = ps.executeQuery();

			while (rs.next()){
				conv.add(new convertE(String.valueOf(rs.getInt(1)),
						rs.getString(2),rs.getString(3),String.valueOf(rs.getInt(4)),
						String.valueOf(rs.getDouble(5)),df.format(rs.getDate(6)).toString(),
						df.format(rs.getDate(7)).toString(),String.valueOf(rs.getDouble(8)),
						rs.getString(9),String.valueOf(rs.getInt(10))));
				
				
/*				empid.add(String.valueOf(rs.getInt(1)));
				empusername.add(rs.getString(2));
				empfirstname.add(rs.getString(3));
				emplastname.add(rs.getString(4));
				emppostion.add(rs.getString(5));
				emppassword.add(rs.getString(6));*/
				
				
				};
/*				addALL.addAll(empid);
				addALL.addAll(empusername);
				addALL.addAll(empfirstname);
				addALL.addAll(emplastname);
				addALL.addAll(emppostion);
				addALL.addAll(emppassword);*/
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conv;
	}
	
	
	
}
