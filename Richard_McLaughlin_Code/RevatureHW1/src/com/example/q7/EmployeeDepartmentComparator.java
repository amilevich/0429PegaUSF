package com.example.q7;

import java.util.Comparator;

import com.example.q7.Employee;


//This is a method that is used to sort employees by department alphabetically using the comparator interface

public class EmployeeDepartmentComparator implements Comparator<Employee> {
	
	public int compare(Employee w1, Employee w2) {
		if( w1.getDepartment().compareTo(w2.getDepartment()) > 0 ) {
			return 1;
		}
		else if (w1.getDepartment().compareTo(w2.getDepartment())<0) {
			return -1;
		}
		else {
			return 0;
		}
	}
}