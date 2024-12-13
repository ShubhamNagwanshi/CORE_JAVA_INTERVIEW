package practical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateUniqueInArrayList {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(2);
		l.add(2);
		l.add(1);
		l.add(3);
		
		Set unique = new HashSet();
		Set duplicate = new HashSet();
		
		for(Object o : l) {
			if(!unique.add(o)) {
				duplicate.add(o);
			}
		}
		
		List duplicateList = new ArrayList(duplicate);
		List uniqueList = new ArrayList(unique);
		
		System.out.println("Original" + l);
		System.out.println("Duplicate" + duplicateList);
		System.out.println("Unique" + uniqueList);
		
	}
}
