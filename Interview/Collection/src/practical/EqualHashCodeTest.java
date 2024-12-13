package practical;

public class EqualHashCodeTest {
	public static void main(String[] args) {
		
		EqualHashCode e1= new EqualHashCode(1,"Shubham",2000);
		EqualHashCode e2= new EqualHashCode(1,"Shubham",2000);

		if(e1.equals(e2)) {
			if(e1.hashCode()== e2.hashCode()) {
				System.out.println("Equal");
			}else {
				System.out.println("Not equal");
			}
		}
	}

}
