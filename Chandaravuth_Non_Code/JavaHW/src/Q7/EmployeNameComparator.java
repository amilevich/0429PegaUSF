package Q7;

import java.util.Comparator;

public class EmployeNameComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees s1, Employees s2) {
		if( s1.getName().compareTo(s2.getName()) > 0 ) {
			return 1;
		} else if (s1.getName().compareTo(s2.getName())<0) {
			return -1;
		} else {
			return 0;
		}
	}




	
	

}
