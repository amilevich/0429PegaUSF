package problem7;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeBaseInfo {

	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Tom", "Physics", 33);
		Employee emp2 = new Employee();
		Employee emp3 = new Employee("Markus", "Computer Science", 25);
		Employee emp4 = new Employee("Selena", "Natural Resources", 31);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
			
		
		
		// UNSORTED
		System.out.println("*************** Unsorted ******************");
		
		for(Employee emp: list)
			System.out.println(emp);
		System.out.println();
		
		// SORTED BY NAME
		Collections.sort( list, new EmployeeNameComparator() );
		
		System.out.println("*************** By Name ******************");
		for(Employee emp: list)
			System.out.println(emp);
		System.out.println();
		
		// SORTED BY DEPARTMENT
		Collections.sort( list, new EmployeeDepartmentComparator() );
		System.out.println("*************** By Dept ******************");
		for(Employee emp: list)
			System.out.println(emp);
		System.out.println();
		
		
		// SORTED BY AGE
		Collections.sort( list, new EmployeeAgeComparator() );
		System.out.println("*************** By Age ******************");
		for(Employee emp: list)
			System.out.println(emp);
		
		
	}
}

