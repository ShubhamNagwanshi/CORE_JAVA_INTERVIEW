package practical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {
		
		EqualHashCode e1= new EqualHashCode(1,"Shubham",2000);
		EqualHashCode e2= new EqualHashCode(1,"Shubham",2000);
		EqualHashCode e3= new EqualHashCode(10,"Naman",5000);
		EqualHashCode e4= new EqualHashCode(12,"Naman",5000);



		if(e1.equals(e2)) {
		
			System.out.println(e1.equals(e2));
			System.out.println(e1.hashCode());
			System.out.println(e2.hashCode());
			
			Set s = new HashSet();
			s.add(e1);
			s.add(e4);
			System.out.println(s);
			s.remove(e2);
			s.add(e3);
			System.out.println(s);
			
//			List l = new ArrayList();
//			
//			l.add(e1);
//			l.add(e4);
//			
//			System.out.println(l);
//			
//			l.remove(e2);
//			l.add(e3);
//			
//			System.out.println(l);
//			
			
		}

	}

}
