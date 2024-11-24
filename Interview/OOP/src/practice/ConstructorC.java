package practice;

public class ConstructorC {

	String fName;
	String lName;
	String address;
	public ConstructorC() {
		System.out.println("default constructor");
	}
	

	
	public ConstructorC(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		
		System.out.println(fName);
		System.out.println(lName);
		
	}
	
	public ConstructorC(String fName, String lName, String address) {
		this(fName,lName);
		this.address = address;
		
		System.out.println(address);
	}
}
