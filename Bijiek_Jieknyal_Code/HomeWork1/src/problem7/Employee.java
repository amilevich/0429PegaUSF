package problem7;

import java.util.Comparator;



public class Employee implements Comparable<Employee> {

    private String name;
    private int age;
    private String Department;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return Department;
    }

    public Employee( String name, int age, String Department) {
   
        this.name = name;
        this.age = age;
        this.Department = Department;
    }

  
   
    @Override
    //this is required to print the user-friendly information about the Employee
    public String toString() {
        return "[ ,  name=" + this.name + ", age=" + this.age + ", Department=" +
                this.Department + "]";
    }

    /**
     * Comparator to sort employees list or array in order of Department
     */
    public static Comparator<Employee> DepartmentComparator = new Comparator<Employee>() {

    	 @Override
         public int compare(Employee e1, Employee e2) {
             return e1.getDepartment().compareTo(e2.getDepartment());
        }
    };

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



	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}}
