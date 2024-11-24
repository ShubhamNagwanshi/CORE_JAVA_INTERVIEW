package practical;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void Deposit(int amount) {
		// System.out.println("total balance" + balance);
		// System.out.println("Deposite Amount" + amount);
		balance = balance + amount;
		System.out.println("After Deposit Balance = " + balance);
	}

	public void Withdrawl(int amount) {
		if ((balance - 2000) < amount) {
			System.out.println("low balance");
		} else {
//			System.out.println("Total balance" + balance);
//			System.out.println("Withdrawl Amount" + amount);

			balance = balance - amount;

			System.out.println("After Withdrawl Balance = " + balance);
		}
	}

	public static void main(String[] args) {

		Account ac = new Account();

		ac.setBalance(1200);
		ac.Deposit(2200);
		ac.Withdrawl(50);

	}
}
