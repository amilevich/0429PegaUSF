package com.questions.q7;
/**
 * Class defines Employee object. Employees will have a name, department, and age.
 * @author Audrey Romero
 *
 */
public class Employee {
	private String name;
	private String department;
	private int age;
	
	public Employee() {
	}

	public Employee(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
	// Overrides class Object's toString() method in order to print readable lists of employees.
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
