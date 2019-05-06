package com.example.q7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.example.q7.Employee;
import com.example.q7.EmployeeDepartmentComparator;
import com.example.q7.EmployeeNameComparator;
import com.example.q7.EmployeeAgeComparator;

public class Main {

	public static void main(String[] args) {
		List<Employee> workers = new ArrayList<Employee>();
		workers.add(new Employee("Richard McLaughlin", "Super Handsome", 26));
		workers.add(new Employee("Eric Schneiderman", "Political Scandal", 35));
		workers.add(new Employee("Arya Stark", "Assassination", 16));
		workers.add(new Employee("Cirsei Lannister", "Sibling Incest", 42));
		workers.add(new Employee("Daenaerys Targarian","Richie's Fantasy Girlfriend",26));
		workers.add(new Employee("Jamie Lannister","Sibling Incest", 42));
		//Fill the list with Game of Thrones references
		
		Collections.sort(workers, new EmployeeAgeComparator());
		killOffCharacters(workers);
		
		//
		System.out.println();
		Collections.sort(workers, new EmployeeNameComparator());
		killOffCharacters(workers);
		
		
		System.out.println();
		Collections.sort(workers, new EmployeeDepartmentComparator());
		killOffCharacters(workers);

	}
	
	//The killOffCharacters command prints the order based off of whichever comparator method is called.
	
	static void killOffCharacters(List<Employee> deadList) {
		System.out.println("Characters Still Alive: ");
		for(Employee x: deadList) {
			System.out.println(x);
		}

}



}