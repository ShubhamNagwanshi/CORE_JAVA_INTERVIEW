package practice;

public class TestCC extends ConstructorC{

	public TestCC(String fName, String lName, String address) {
		super(fName, lName, address);
	}
	
	public static void main(String[] args) {
		
		TestCC t = new TestCC("Shubh", "Nagwanshi", "Indore");
	}
}
