package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSortByIdNameSalary {
public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(new Employee(4,"Rahul",8000));
		l.add(new Employee(2,"Naman",6000));
		l.add(new Employee(3,"Ram",4000));
		l.add(new Employee(1,"Shubh",10000));
		l.add(new Employee(1,"Gopal",10000));
		l.add(new Employee(2,"Naman",9000));
		
		E_SortByIdNameSalary byIdNameSalary = new E_SortByIdNameSalary();
		
		
		Collections.sort(l, byIdNameSalary);
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
