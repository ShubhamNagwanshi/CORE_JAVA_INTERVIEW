package pratical;

public class TestCustomUnchecked {
	public static void main(String[] args) {
		try {
			dad();
		} catch (CustomUnchecked e) {
			System.out.println(e);
		}

	}

	public static void dad() {
		mom();
	}

	public static void mom() {
		son();
	}

	public static void son() {

		CustomUnchecked c = new CustomUnchecked();

		throw c;
	}
}
