package com.homework.question07;

import java.util.Comparator;

public class EmployeeDepartmentComparator implements Comparator<Employee> {
	
	//a comparator interface is implemented for unnatural ordering

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getDepartment().compareTo(o2.getDepartment()) > 0) {
			return 1;
		} else if (o1.getDepartment().compareTo(o2.getDepartment()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
