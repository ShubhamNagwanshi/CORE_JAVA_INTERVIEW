package practice;

public class TestInt implements Interface1 {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public static void main(String[] args) {
		
		TestInt t = new TestInt();
		
		System.out.println(t.sum(10, 5));
		System.out.println(t.x);
	}
}
