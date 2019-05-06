package com.questions.q7;
import java.util.Comparator;
/**
 * Classes implement Comparator interface so that employees can be sorted by name,
 * department or age.
 * @author Audrey Romero
 *
 */
class Sort implements Comparator<Employee> {

	// Compares two employee names alphabetically and returns their proper order.
	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getName().compareTo(e2.getName()) > 0) {
			return 1;
		} else if (e1.getName().compareTo(e2.getName()) < 0) {
			return -1;
		} else {
		    return 0;
		}
	}
}	
	
class sortDepartment implements Comparator<Employee> {
	// Compares two employee departments alphabetically and returns their proper order.
	public int compare(Employee e1, Employee e2) {
		if (e1.getDepartment().compareTo(e2.getDepartment()) > 0) {
			return 1;
		} else if (e1.getDepartment().compareTo(e2.getDepartment()) < 0) {
			return -1;
		} else {
		    return 0;
		}
	}
}	
	
class sortAge implements Comparator<Employee> {
	// Compares two employees by age and returns their proper order.
	public int compare(Employee e1, Employee e2) {
		// Integer values must utilize wrapper class Integer in order to use compareTo().
		Integer age1 = new Integer(e1.getAge());
		Integer age2 = new Integer(e2.getAge());
		
		if (age1.compareTo(age2) > 0) {
			return 1;
		} else if (age1.compareTo(age2) < 0) {
			return -1;
		} else {
		    return 0;
		}
	}
}
