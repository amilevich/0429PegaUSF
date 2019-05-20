package com.dao;

import com.model.Employee;

public interface EmployeeDao {

	// CREATE 
	public void insertEmployee(Employee exp);

	
	//READ
	public Employee selectEmployee(String name);
	//READ
	public Employee selectEmployee1();
	// UPDATE
	public void updateEmployee(Employee exp);
	
	//DELETE
	public void deleteEmployee(Employee exp);
}
