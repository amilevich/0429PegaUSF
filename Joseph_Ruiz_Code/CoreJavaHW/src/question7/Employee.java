package question7;

// Name: Employee.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Employee class

public class Employee {

	private String name;
	private String department;
	private int age;

	public Employee(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(Name: ");
		builder.append(name);
		builder.append(", Department: ");
		builder.append(department);
		builder.append(", Age: ");
		builder.append(age + ")");
		return builder.toString();
	}

}
