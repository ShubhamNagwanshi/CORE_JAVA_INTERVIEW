package practice;

public class C_Overloading {

	public C_Overloading() {
		System.out.println("default constructor");
	}
	
	public C_Overloading(String name) {
		System.out.println(name);
	}
	
	public C_Overloading(String name, String address) {
		System.out.println(name + " "+ address);
	}
	
	public static void main(String[] args) {
		
		C_Overloading c = new C_Overloading();
		C_Overloading c1 = new C_Overloading("Shubh");
		C_Overloading c2 = new C_Overloading("Shubham", "Indore");
	}
}
