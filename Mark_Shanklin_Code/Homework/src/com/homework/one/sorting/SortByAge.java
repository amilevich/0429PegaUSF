package com.homework.one.sorting;

import java.util.Comparator;

import com.homework.one.QuestionSeven.Employee;

/*
 * Used for Question 7
 */
public class SortByAge implements Comparator<Employee> {
	// Used for sorting in ascending order of
	// age
	public int compare(Employee a, Employee b) {		
		if (a.getAge() > b.getAge()) {
			return 1;
		} else if (a.getAge() < b.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}
}
