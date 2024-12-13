package pratical;

public class BankTest {
	public static void main(String[] args) {

		BankAccount a = new BankAccount();
		a.setBalance(5000);
		a.deposit(100);
		System.out.println(a.getBalance());

		try {
			a.withdraw(5000);
			System.out.println(a.getBalance());

		} catch (BankException e) {
			System.out.println(e.getMessage());
		}
	}
}
