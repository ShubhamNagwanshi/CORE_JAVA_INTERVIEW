package comparator;

import java.util.Comparator;

public class E_SortByIdNameSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getId() == o2.getId() && o1.getName().equals(o2.getName())) {
			return o1.getSalary() - o2.getSalary();
		} else if (o1.getId() == o1.getId()) {
			return o1.getName().compareTo(o2.getName());
		} else {
			return o1.getId() - o2.getId();
		}
	}
	
	/*
	 * public int compare(Employee o1, Employee o2) { // Primary: Compare by id if
	 * (o1.getId() != o2.getId()) { return o1.getId() - o2.getId(); } // Secondary:
	 * Compare by name if (!o1.getName().equals(o2.getName())) { return
	 * o1.getName().compareTo(o2.getName()); } // Tertiary: Compare by salary return
	 * o1.getSalary() - o2.getSalary(); }
	 */
}
