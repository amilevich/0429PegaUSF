package Q7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainQ7 {

	public static void main(String[] args) {

		List<Employees> Employee = new ArrayList<Employees>();
		Employee.add(new Employees("A1", "Computer Science Department", 21));
		Employee.add(new Employees("B2", "Math Department", 50));
		Employee.add(new Employees("C3", "English Department", 18));

		System.out.println("Sort by age");
		Collections.sort(Employee, new EmployeAgeComparator());
		printListPretty(Employee);
		System.out.println();

		System.out.println("Sort by Department");
		Collections.sort(Employee, new EmployeDepartmentComparator());
		printListPretty(Employee);
		System.out.println();

		System.out.println("Sort by name");
		Collections.sort(Employee, new EmployeNameComparator());
		printListPretty(Employee);
		System.out.println();
	}

	static void printListPretty(List<Employees> eList) {
		System.out.println("Employees: ");
		for (Employees e : eList) {
			System.out.println(e);
		}
	}

}
