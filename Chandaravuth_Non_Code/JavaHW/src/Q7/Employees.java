package Q7;

public class Employees implements Comparable<Employees> {
	
	private String name;
	private String department;
	private int age;
	private int primaryKey;
	
	
	public Employees(){
		
	}
	
	
	public Employees(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}
	


	public Employees(String name, String department, int age, int primaryKey) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
		this.primaryKey = primaryKey;
	}


	@Override
	public String toString() {
		return "Employees [name=" + name + ", department=" + department + ", age=" + age + "]";
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
	


	public int getPrimaryKey() {
		return primaryKey;
	}


	public void setPrimaryKey(int primaryKey) {
		this.primaryKey = primaryKey;
	}


	@Override
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub
		return this.getPrimaryKey() - o.getPrimaryKey();
	}
		
	

}
