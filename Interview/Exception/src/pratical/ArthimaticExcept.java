package pratical;

public class ArthimaticExcept {
	public static void main(String[] args) {
		// int a = 10;
		try {
			int c = 10 / 0;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
//			e.printStackTrace();
		}
	}
}
