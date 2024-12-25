package pratical;

public class BankAccount {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amt) {
		balance = balance + amt;

		// System.out.println(balance);
	}

	public void withdraw(double amt) throws BankException {
		
		if ((balance - amt) < 2000) {

			BankException e = new BankException("Amount is less than 2000");
			throw e;
		}else {
			balance = balance - amt;
		}
		
	}
}
