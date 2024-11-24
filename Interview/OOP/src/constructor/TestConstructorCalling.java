package constructor;

public class TestConstructorCalling extends ConstructorCalling{

	public TestConstructorCalling(String fName, String lName, String address) {
		super(fName, lName, address);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling("Shubh", "Nagwanshi", "Indore");
	}

}
