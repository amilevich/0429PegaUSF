package Q7;

import java.util.Comparator;

public class EmployeAgeComparator  implements Comparator<Employees> {

	@Override
	public int compare(Employees s1, Employees s2) {
		int s1age = s1.getAge();
		int s2age = s2.getAge();
		
		if(s1age<s2age)
		{
			return -1;
		}
		else if(s1age>s2age)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
		
	}

}
