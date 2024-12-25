package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHighestSalary {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(1000);
		l.add(3000);
		l.add(7000);
		l.add(4000);
		
		System.out.println("Highest");
		l.stream().distinct().sorted(Collections.reverseOrder()).findFirst().ifPresent(e -> System.out.println(e));
		
		System.out.println("Second Highest");
		l.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
	}
}
