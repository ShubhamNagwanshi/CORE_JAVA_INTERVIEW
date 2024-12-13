package comparator;

import java.util.Comparator;

public class EmployeeSortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getId() == o2.getId()) {
			return 0;
		} else if (o1.getId() > o2.getId()) {
			return 1;
		} else {

			return -1;
		}

	}
}
