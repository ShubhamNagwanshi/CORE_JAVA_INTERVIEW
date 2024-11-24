package practice;

public class TestDeep {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Customer1 c = new Customer1("Shubh");
	Customer1 c1 = (Customer1) c.clone();
	
	c1.name = "Shubham";
	c1.no.balance = 200;
	
	System.out.println(c.name);
	System.out.println(c.no.balance);
	
	System.out.println(c1.name);
	System.out.println(c1.no.balance);
	
}
}
