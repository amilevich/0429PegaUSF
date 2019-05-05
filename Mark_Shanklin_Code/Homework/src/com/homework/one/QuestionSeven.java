package com.homework.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.homework.one.sorting.SortByAge;
import com.homework.one.sorting.SortByDepartment;
import com.homework.one.sorting.SortByName;

/*
 * Sort two employees based on their name, department, and age using the Comparator interface.
 */
public class QuestionSeven {

	public static void main(String[] args) {
		// created Three employees just to bet show the ordering
		Employee empOne = new Employee("Dan", "HR", 18);
		Employee empTwo = new Employee("Bob", "IT", 45);
		Employee empThree = new Employee("Jim", "CSR", 60);

		//list of employees
		List<Employee> empList = new ArrayList<Employee>();

		//add the employees to list
		empList.add(empOne);
		empList.add(empTwo);
		empList.add(empThree);

		//sort based on name and print list
		System.out.println("Sorted by Name");
		Collections.sort(empList, new SortByName());
		printListPretty(empList);

		//sort based on department and print
		System.out.println("Sorted by Department");
		Collections.sort(empList, new SortByDepartment());
		printListPretty(empList);

		//sort based on age and print
		System.out.println("Sorted by Age");
		Collections.sort(empList, new SortByAge());
		printListPretty(empList);

	}

	/*
	 * Method used to print the list out in custom manner
	 */
	static void printListPretty(List<Employee> sList) {
		System.out.println("Employee's: ");
		for (Employee s : sList) {
			System.out.println(s);
		}
	}

	/*
	 * Employee class
	 */
	public static class Employee {
		String name;
		String department;
		int age;
		
		/*
		 * constructor using fields
		 */
		public Employee(String name, String department, int age) {
			super();
			this.name = name;
			this.department = department;
			this.age = age;
		}

		/*
		 * Getter for name
		 */
		public String getName() {
			return name;
		}

		/*
		 * Setter for name
		 */
		public void setName(String name) {
			this.name = name;
		}

		/*
		 * Getter for Department
		 */
		public String getDepartment() {
			return department;
		}

		/*
		 * Setter for Department
		 */
		public void setDepartment(String department) {
			this.department = department;
		}

		/*
		 * Getter for Age
		 */
		public int getAge() {
			return age;
		}

		/*
		 * Setter for Age
		 */
		public void setAge(int age) {
			this.age = age;
		}

		/*
		 * (non-Javadoc)
		 * @see java.lang.Object#toString()
		 * Override for the toString method contain in the object class
		 */
		@Override
		public String toString() {
			return "Employee " + name + ", in the " + department + " department and is " + age + "year[s] old.";
		}

	}
}
