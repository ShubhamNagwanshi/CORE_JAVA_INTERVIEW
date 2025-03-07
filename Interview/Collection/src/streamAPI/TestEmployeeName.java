package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;;

public class TestEmployeeName {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();

		l.add(new Employee(1, "Shubh"));
		l.add(new Employee(4, "Naman"));
		l.add(new Employee(2, "Pranav"));
		l.add(new Employee(3, "Rahul"));

		l.stream().sorted(Comparator.comparing(Employee::getName))
				.forEach(e -> System.out.println(e.getId() + " =" + e.getName()));
	}
}
