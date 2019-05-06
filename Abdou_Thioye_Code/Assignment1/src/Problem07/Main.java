package Problem07;

import java.util.Arrays;

public class Main {

	/**
	 * This class shows how to sort custom objects array/list implementing
	 * Comparable and Comparator interfaces
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// sorting custom object array
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, "Computer");
		empArr[1] = new Employee(20, "Arun", 29, "Programing");
		empArr[2] = new Employee(5, "Lisa", 35, "HumanResource");
		empArr[3] = new Employee(1, "Pankaj", 32, "Accounting");

		// sort employees array using Comparator by Name
		Arrays.sort(empArr, Employee.NameComparator);
		System.out.println("**************************Employees Sorted by Name:********************************\n" + Arrays.toString(empArr));
		System.out.println();

		// sort employees array using Comparator by Department
		Arrays.sort(empArr, Employee.DepartmentComparator);
		System.out.println("**************************Employees Sorted by Department:**************************\n" + Arrays.toString(empArr));
		System.out.println();

		// sort employees array using Comparator by Age
		Arrays.sort(empArr, Employee.AgeComparator);
		System.out.println("**************************Employees Sorted by Age:*********************************\n" + Arrays.toString(empArr));
		System.out.println();

	}

}
