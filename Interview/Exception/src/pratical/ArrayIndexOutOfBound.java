package pratical;

public class ArrayIndexOutOfBound {
public static void main(String[] args) {
	
	String[] a = {"Shubham","Pranav","Naman"};
	
	try {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[11]);
		}
	} catch (ArrayIndexOutOfBoundsException e) {
        //e.printStackTrace();
		System.out.println(e);
	}
}
}
