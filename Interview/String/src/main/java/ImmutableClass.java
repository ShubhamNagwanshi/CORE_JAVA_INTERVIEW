
public class ImmutableClass {

	private String account;
	private int amount;
	
	ImmutableClass(String account, int amount){
		this.account = account;
		this.amount = amount;
		
	}
	
	public String getAccount() {
		return account;
	}
	
	public int getAmount() {
		return amount;
	}
	
	
	public static void main(String[] args) {
		ImmutableClass im = new ImmutableClass("BOI123", 5000);
		
		System.out.println(im.getAccount());
		System.out.println(im.getAmount());
	}
}
