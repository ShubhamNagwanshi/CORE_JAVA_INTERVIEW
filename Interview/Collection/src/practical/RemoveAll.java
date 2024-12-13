package practical;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAll {
public static void main(String[] args) {
	
	Collection c1 = new ArrayList();

	c1.add(1);
	c1.add(2);
	c1.add(3);
	c1.add(4);

	Collection c2 = new ArrayList();

	c2.add(1);
	c2.add(2);
	c2.add(3);
//	c2.add(4);

	System.out.println("c1 =>" + c1);
	System.out.println("c2 =>" + c2);
	
	System.out.println(c1.containsAll(c2));

	c1.removeAll(c2);

	System.out.println("c1 =>" + c1);
	System.out.println("c2 =>" + c2);
	
	
}
}
