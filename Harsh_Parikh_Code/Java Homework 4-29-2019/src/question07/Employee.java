package question07;

public class Employee {
	
	// declaring variables
    private String name;
    private String department;
    private int age;

    // Getting the name method from the variables
    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getName() {
    	// returns name and transfer this to the class Employee Main
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
    	// returning the name, age, and repartment to the console with spaces in-between
    	return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}

