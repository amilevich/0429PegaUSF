package Question.Seven;

import java.util.Comparator;

//This comparator set up to compare the department names of the employees 

public class EmployeeDeptComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees e1, Employees e2) {
		
		if(e1.getDept().compareTo(e2.getDept()) > 0) { //If it is greater that 0 then it is the first args, and will be known as true
			return 1; //put first 
		}else if (e1.getDept().compareTo(e2.getDept()) < 0) {
			return -1;
		}else {
			return 0;
		}

}
	
}