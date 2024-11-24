package practice;

public class Customer1 implements Cloneable {

	public String name;
	public Account1 no;
	
	public Customer1(String name) {
		this.name = name;
		no = new Account1(100);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Customer1 c = (Customer1) super.clone();
		c.no = (Account1) no.clone();
		return c;
	}
}
