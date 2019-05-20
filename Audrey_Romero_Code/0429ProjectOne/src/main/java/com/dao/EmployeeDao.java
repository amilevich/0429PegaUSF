package com.dao;
import java.util.List;
import com.model.Employee;

public interface EmployeeDao {
	
	// Create
	public void insertEmployee(Employee e);
	
	// Read
	public Employee selectEmployee(String username); // Select by which field?
	public List<Employee> selectAllEmployees();
	
	// Update
	public void updateEmployee(Employee e);
	
	// Delete
	public void deleteEmployee(Employee e);
	
}
