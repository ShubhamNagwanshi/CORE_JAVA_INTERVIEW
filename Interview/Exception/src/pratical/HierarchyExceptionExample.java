package pratical;

public class HierarchyExceptionExample {
	public static void main(String[] args) {

		String s = "Java";

		try {
			System.out.println(s.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("StringIndexOutOfBoundsException......");

		} catch (Exception e) {

			System.out.println("Exception.....");
		}
	}

}
