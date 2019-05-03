package com.example.sorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordering {
	
	/*
	 * Comparable Interface (natural ordering)
	 * ordering provided by the JVM
	 * interface allows to sort based on one element
	 * numbers - ascending
	 * characters - unicode values 
	 */
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "JudasBob", LocalDate.of(1007, 12, 1), 3.5, 3));
		students.add(new Student(2, "BerryD", LocalDate.of(1520,8, 19), 2.7, 4));
		students.add(new Student(18, "BettyKrokerh", LocalDate.of(2019, 5, 3), 4.5, 2));
		students.add(new Student(4, "JeanLouise", LocalDate.of(2011, 6, 23), 2.0, 4));
		
		//collections - utility class filled with static methods to
		// be used on the data structures from the Collection API
		
		//Collections.sort(students);
		//printListPretty(students);
		
//		System.out.println("Students sorted by dob: ");
//		Collections.sort(students, new StudentDobComparator());
//		printListPretty(students);
		
		System.out.println("Students sorted by name A->Z: ");
		Collections.sort(students, new StudentNameComparator());
		printListPretty(students);
		//System.out.println(students);
		
	}
	
	static void printListPretty(List<Student> sList) {
		System.out.println("Students: ");
		for(Student s: sList) {
			System.out.println(s);
		}
	}
	

}
