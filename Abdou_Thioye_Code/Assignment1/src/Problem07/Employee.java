
package Problem07;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;
	private String department;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

	public Employee(int id, String name, int age, String department) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}

	@Override
	public int compareTo(Employee emp) {
		// let's sort the employee based on an id in ascending order
		// returns a negative integer, zero, or a positive integer as this employee id
		// is less than, equal to, or greater than the specified object.
		return (this.id - emp.id);
	}

	@Override
	// this is required to print the user-friendly information about the Employee
	public String toString() {
		return "\nId=" + this.getId() + "\nName=" + this.getName() + "\nAge=" + this.getAge() + "\nDepartment=" + this.getDepartment()
				+ "\n ";
	}

	/**
	 * Comparator to sort employees list or array in order of department
	 */
	public static Comparator<Employee> DepartmentComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getDepartment().compareTo(e2.getDepartment());
		}
	};

	public static Comparator<Employee> getDepartmentComparator() {
		return DepartmentComparator;
	}

	public static void setDepartmentComparator(Comparator<Employee> departmentComparator) {
		DepartmentComparator = departmentComparator;
	}

	public static Comparator<Employee> getAgeComparator() {
		return AgeComparator;
	}

	public static void setAgeComparator(Comparator<Employee> ageComparator) {
		AgeComparator = ageComparator;
	}

	public static Comparator<Employee> getNameComparator() {
		return NameComparator;
	}

	public static void setNameComparator(Comparator<Employee> nameComparator) {
		NameComparator = nameComparator;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Comparator to sort employees list or array in order of Age
	 */
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getAge() - e2.getAge();
		}
	};

	/**
	 * Comparator to sort employees list or array in order of Name
	 */
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};
}
