package practical;

public class PriorityThread  extends Thread{

	String name;
	
	public PriorityThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(i +"="+ name);
		}
	}
}
