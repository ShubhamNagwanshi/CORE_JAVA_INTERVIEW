package constructor;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorOverloading(String fName) {
		System.out.println(fName);
	}
	
	public ConstructorOverloading(String fName,String lName) {
		System.out.println(fName + " " + lName);
	}
	
	
	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
		ConstructorOverloading c1 = new ConstructorOverloading("Shubh");
		ConstructorOverloading c2 = new ConstructorOverloading("Shubh","Nagwanshi");
	}
}
