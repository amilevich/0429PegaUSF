package Project0_Banking_Application.Project0_Banking_Application;

public class Employee {
	private String name;
	private String position;
	private int key;
	
	public Employee()
	{
		
	}
	
	public void checkBalance()
	{
		
	}

	public Employee(String name, String position, int key) {
		super();
		this.name = name;
		this.position = position;
		this.key = key;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", key=" + key + "]";
	}
	
	

}
