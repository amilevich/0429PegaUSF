package Question.Seven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeOrdering { 
	
	public static void main(String args[]) {
		
		List<Employees> Emp = new ArrayList<Employees>();  //List of employees and attributes 
		Emp.add(new Employees(30, "Mia Thermopolis", "Executive"));
		Emp.add(new Employees(30, "Pheobe Buffet", "Human Resources"));
		
		//Ordering the name order with Natural sort 
		System.out.println("Employees sorted name in alphabetical order: ");
		Collections.sort(Emp, new EmployeeNameComparator());
		printListPretty(Emp); 
		
		//Passing in a datatype through natural ordering 
		//printListPretty will call it in and pass it it top Employees 
	}

	static void printListPretty(List<Employees> empList) {
	System.out.println(" Employees: ");
	for(Employees emp : empList ) { //For each employee in empList.. enhanced for loop
						//goed from beginning and iterates through each 
		System.out.println(emp);
	}
	}
 
}
