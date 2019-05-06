package Question.Seven;

import java.util.Comparator;

//This comparator is set up to compare the age of the two employees

public class EmployeeAgeComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees e1, Employees e2) { 
				
		if(e1.getAge() > e2.getAge()) {
			return 1; //Leave the order if it returns 1 
		}else if (e1.getAge() < e2.getAge()) {
			return -1;
		}else {
			return 0;
			
		}
	}

}
