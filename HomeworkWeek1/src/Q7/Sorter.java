package Q7;

import java.util.ArrayList;
import java.util.Collections;

public class Sorter
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Tim Timmins", "Consulting", 31);
		Employee emp2 = new Employee("Bob Dobbs", "Marketing", 43);
		Employee emp3 = new Employee("Patricia Croquet", "HR", 47);
		Employee emp4 = new Employee("Elmer Glooe", "R & D", 39);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
			
		
		
		// UNSORTED
		System.out.println("***Unsorted***");
		
		for(Employee emp: list)
			System.out.println(emp);
		System.out.println();
		
		// SORTED BY NAME
		Collections.sort( list, new Name() );
		
		System.out.println("***By Name***");
		for(Employee emp: list)
			System.out.println(emp);
		System.out.println();
		
		// SORTED BY DEPARTMENT
		Collections.sort( list, new Department() );
		System.out.println("***By Dept***");
		for(Employee emp: list)
			System.out.println(emp);
		System.out.println();
		
		
		// SORTED BY AGE
		Collections.sort( list, new Age() );
		System.out.println("***By Age***");
		for(Employee emp: list)
			System.out.println(emp);
		
		
	}
}