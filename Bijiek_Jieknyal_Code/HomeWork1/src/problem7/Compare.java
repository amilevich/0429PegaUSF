package problem7;

import java.util.Comparator;

public class Compare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int flag = o1.getAge() - o2.getAge();
		if (flag == 0)
			flag = o1.getName().compareTo(o2.getName());
		return flag;
	}

}
