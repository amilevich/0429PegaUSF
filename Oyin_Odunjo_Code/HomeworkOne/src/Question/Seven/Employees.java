package Question.Seven;

public class Employees implements Comparable<Employees> { //Creating the bean in the main method 
	
	private int age;
	private String name, dept;
	
	public Employees() {
		
	}
	//Constructor using fields 
	public Employees(int age, String name, String dept) { 
		super();
		this.age = age;
		this.name = name;
		this.dept = dept;
	}

	@Override //toString method 
	public String toString() {
		return "Employees [age=" + age + ", name=" + name + ", dept=" + dept + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//***Check if this is needed****
	@Override 
	public int compareTo(Employees o) {
		return this.getAge()-o.getAge(); 
	}
	

}
