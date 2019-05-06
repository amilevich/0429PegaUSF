package com.homework.question07;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee>{
	
	//another comparator is implemented in this class

	@Override
	public int compare(Employee o1, Employee o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
