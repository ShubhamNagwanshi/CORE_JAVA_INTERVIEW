package practice;

public class Account1 implements Cloneable{

	public int balance;
	
	public Account1(int balance) {
		this.balance = balance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
