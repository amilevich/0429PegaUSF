package question7;

// Name: EmployeeAgeComparator.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Employee age comparator class

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getAge() > o2.getAge()) {
			// o1 is older than o2
			return 1;
		} else if (o1.getAge() < o2.getAge()) {
			// o1 is younger than o2
			return -1;
		} else {
			// equal or something else
			return 0;
		}
	}

}
