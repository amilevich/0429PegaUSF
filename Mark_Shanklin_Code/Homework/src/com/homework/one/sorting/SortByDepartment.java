package com.homework.one.sorting;

import java.util.Comparator;

import com.homework.one.QuestionSeven.Employee;

/*
 * Used for Question 7
 */
public class SortByDepartment implements Comparator<Employee> {
	// Used for sorting in ascending order of
	// department number
	public int compare(Employee a, Employee b) {
		if (a.getDepartment().compareTo(b.getDepartment()) > 0) {
			return 1;
		} else if (a.getDepartment().compareTo(b.getDepartment()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
