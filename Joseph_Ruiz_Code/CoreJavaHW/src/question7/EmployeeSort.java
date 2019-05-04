package question7;

// Name: EmployeeSort.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Employee comparator class demo

import java.util.ArrayList;

public class EmployeeSort {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		Employee e1 = new Employee("Author", "Programming", 23);
		a.add(e1);
		Employee e2 = new Employee("Anyone", "Accounting", 34);
		a.add(e2);
		System.out.println("Unsorted");
		System.out.println(a);
		a.sort(new EmployeeNameComparator());
		System.out.println("Sort by name");
		System.out.println(a);
		a.sort(new EmployeeDepartmentComparator());
		System.out.println("Sort by department");
		System.out.println(a);
		a.sort(new EmployeeAgeComparator());
		System.out.println("Sort by age");
		System.out.println(a);
	}

}
