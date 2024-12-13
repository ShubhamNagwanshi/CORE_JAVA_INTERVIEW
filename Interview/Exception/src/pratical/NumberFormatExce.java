package pratical;

public class NumberFormatExce {

	public static void main(String[] args) {

		String s = "Shubh123";

		try {

			int i = Integer.parseInt(s);

		} catch (NumberFormatException e) {

			System.out.println(e);
		}
	}
}
