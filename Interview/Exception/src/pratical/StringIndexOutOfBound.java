package pratical;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		
		String s = "Shubham";
		
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(9));
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
