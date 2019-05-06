package com.questions.q7;
import java.util.*;
/**
 * This program creates a new ArrayList of employees and two employees to store in the list.
 * Employees are then sorted by name, department and age. Results of each sort are printed
 * to the console.
 * @author Audrey Romero
 *
 */
public class Application {
	
	public static void main (String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Chowder", "Electronics", 23));
		employees.add(new Employee("Applejack", "Home and Gardening", 19));
		
		System.out.println("Employees sorted alphabetically by name:");
		Collections.sort(employees, new Sort());
		printEmployeeList(employees);
		
		System.out.println("Employees sorted alphabetically by Department:");
		Collections.sort(employees, new sortDepartment());
		printEmployeeList(employees);
		
		System.out.println("Employees sorted by Age:");
		Collections.sort(employees, new sortAge());
		printEmployeeList(employees);
		
	}
	/**
	 * Utilizes for each loop to print to console a list of all employees.
	 * @param employeeList    A list of employees to be printed
	 */
	static void printEmployeeList(List<Employee> employeeList) {
		for (Employee e : employeeList) {
			System.out.println(e);
		}
		System.out.println("\n");
	}
}
