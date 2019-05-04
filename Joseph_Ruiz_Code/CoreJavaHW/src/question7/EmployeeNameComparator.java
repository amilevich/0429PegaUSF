package question7;

// Name: EmployeeNameComparator.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Employee name comparator class

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String o1n = o1.getName();
		String o2n = o2.getName();
		if (o1n.compareTo(o2n) > 1) {
			// o1's name is later in the alphabet than o2's
			return 1;
		} else if (o1n.compareTo(o2n) < 1) {
			// o1's name is earlier in the alphabet than o2's
			return -1;
		} else {
			// same name possibly
			return 0;
		}
	}

}
