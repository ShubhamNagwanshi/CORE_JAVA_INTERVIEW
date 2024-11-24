package practical;

public class InterfaceTest implements Interface1 {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public static void main(String[] args) {
		
		InterfaceTest i = new InterfaceTest();
		
		System.out.println(i.sum(20, 10));
		
		System.out.println(i.x);
	}

}
