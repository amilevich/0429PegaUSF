package question7;

// Name: EmployeeDepartmentComparator.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Employee department comparator class

import java.util.Comparator;

public class EmployeeDepartmentComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String o1n = o1.getDepartment();
		String o2n = o2.getDepartment();
		if (o1n.compareTo(o2n) > 1) {
			// o1's department name is later in the alphabet than o2's
			return 1;
		} else if (o1n.compareTo(o2n) < 1) {
			// o1's department name is earlier in the alphabet than o2's
			return -1;
		} else {
			// same name possibly
			return 0;
		}
	}

}
