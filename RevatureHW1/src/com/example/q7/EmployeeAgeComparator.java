package com.example.q7;

import java.util.Comparator;
import com.example.q7.Employee;

//This is a method that is used to sort employees by age from youngest to oldest using the comparator interface

public class EmployeeAgeComparator implements Comparator<Employee> {
	public int compare(Employee w1, Employee w2) {
		if( w1.getAge()>=w2.getAge()) {
			return 1;
		}
		else if (w1.getAge()<(w2.getAge())) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
