package pratical;

public class MultipleExceptionInSingleCatch {

	public static void main(String[] args) {
		
		int i = 10;
		String name = null;
		try {
			int j = i/0;
			System.out.println(name.length());
		} catch (ArithmeticException | NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}
}