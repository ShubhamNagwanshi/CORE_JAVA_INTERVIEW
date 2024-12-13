package pratical;

public class MultiCatch {
	public static void main(String[] args) {

		try {
			int i = 10 / 0;
			String s = null;
			System.out.println(s.length());
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (RuntimeException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
