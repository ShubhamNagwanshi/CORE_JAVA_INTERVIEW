package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeSalary {

	public static void main(String[] args) {
		
		List<EmployeeSalary> l = new ArrayList<EmployeeSalary>();
		
		l.add(new EmployeeSalary(20000, "Shubh"));
		l.add(new EmployeeSalary(30000, "Naman"));
		l.add(new EmployeeSalary(400, "Pranav"));
		l.add(new EmployeeSalary(5000, "Rahul"));
		
		l.stream().distinct().filter(c -> (c.getSalary() >= 20000))
		.forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));
	}
}
