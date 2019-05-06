package com.homework.question07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeOrdering {

	public static void main(String[] args) {
		
		//an arraylist is created and the employee names are added
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Andre", "Meat/Poultry/Fish", 28));
		employees.add(new Employee("Jada", "Produce", 21));
		
		//the employees are sorted by name
		Collections.sort(employees);
		listPrinter(employees);
		
		//the employees are sorted by age
		System.out.println("(By age): ");
		Collections.sort(employees, new EmployeeAgeComparator());
		listPrinter(employees);
		
		//the employees are sorted by department
		System.out.println("(By department): ");
		Collections.sort(employees, new EmployeeDepartmentComparator());
		listPrinter(employees);
	}
	//this is printed before the contents of the list are
	static void listPrinter(List<Employee> eList) {
		System.out.println("Top Two Employees: ");
		for(Employee e: eList) {
			System.out.println(e);
		}
	}

}
