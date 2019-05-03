package com.example.sorting;

import java.time.LocalDate;
import java.util.Comparator;

public class StudentDobComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		LocalDate s1Dob = s1.getDob();
		LocalDate s2Dob = s2.getDob();
		
		if( s1Dob.isBefore(s2Dob)) {
			return 1;
		} else if (s1Dob.isAfter(s2Dob)) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
	/*
	 * Comparator Interface 
	 * unnatural ordering
	 * All values can be compared to all other values
	 * Custom ordering
	 * 
	 * You have to specifically tell a sorting method.
	 * If you don't specify, then the sorting algorithm will use the
	 * natural ordering instead.
	 */
	
	

}
