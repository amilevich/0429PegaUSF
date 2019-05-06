package com.example.q7;

import java.util.Comparator;

//This is a method that is used to sort employees by department alphabetically using the comparator interface


import com.example.q7.Employee;

public class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee w1, Employee w2) {
		if( w1.getName().compareTo(w2.getName()) > 0 ) {
			return 1;
		} else if (w1.getName().compareTo(w2.getName())<0) {
			return -1;
		} else {
			return 0;
		}
	}
	
	

}
