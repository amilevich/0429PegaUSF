package Question.Seven;

import java.util.Comparator;

//Comparator created to compare the employee names 

public class EmployeeNameComparator implements Comparator<Employees> {

		@Override
		public int compare(Employees e1, Employees e2) {
			
			if(e1.getName().compareTo(e2.getName()) > 0) { //If it is greater that 0 then it is the first args, and will be known as true
				return 1; //put first 
			}else if (e1.getName().compareTo(e2.getName()) < 0) {
				return -1;
			}else {
				return 0;
			}

}

}