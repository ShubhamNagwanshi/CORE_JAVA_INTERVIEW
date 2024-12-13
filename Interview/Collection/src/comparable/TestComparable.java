package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(new Student(4,"Shubh",3000));
		l.add(new Student(2,"AA",5000));
		l.add(new Student(1,"BB",9000));
		l.add(new Student(3,"CC",4000));
		
		Collections.sort(l);
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
