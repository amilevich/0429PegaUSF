package Q7;

public class EInfo {	//creating the 3 categories 
    private String name;
    private String department;
    private int age;

    public EInfo(String name, String department, int age) { //creating the getters and setters
        this.name = name;				//creating the constructors using fields
        this.department = department;
        this.age = age;
    }

    public String getName() {
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
    public String toString() { //creating the to string
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}