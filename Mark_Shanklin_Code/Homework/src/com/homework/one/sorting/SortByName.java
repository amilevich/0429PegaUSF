package com.homework.one.sorting;

import java.util.Comparator;

import com.homework.one.QuestionSeven.Employee;

/*
 * Used for Question 7
 */
public class SortByName implements Comparator<Employee> {
		// Used for sorting in ascending order of
		// name
		public int compare(Employee a, Employee b) {
			if (a.getName().compareTo(b.getName()) > 0) {
				return 1;
			} else if (a.getName().compareTo(b.getName()) < 0) {
				return -1;
			} else {
				return 0;
			}
		}
	}
