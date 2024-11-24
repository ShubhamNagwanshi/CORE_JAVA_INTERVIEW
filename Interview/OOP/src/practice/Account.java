package practice;

public class Account {

	public int balance;
	
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
		
		System.out.println("After deposit balance =>"+ balance);
	}
	
	public void withdrawl(int amount) {
		if((balance -2000)< amount) {
			System.out.println( "low balance");
		}else {
			balance = balance - amount;
			
			System.out.println("Balance after withdrawl =>" + balance);
		}
	}
	
	public static void main(String[] args) {
		
		Account ac = new Account();
		
		ac.setBalance(1500);
		ac.deposit(2000);
		ac.withdrawl(1000);
	}
}
