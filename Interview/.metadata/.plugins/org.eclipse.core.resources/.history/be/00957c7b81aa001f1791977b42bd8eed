package practice;

public class TestShallow extends ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ShallowCloning s = new ShallowCloning();
		s.balance = 100;
		
		ShallowCloning s1 = (ShallowCloning) s.clone();
		
		s1.balance = 200;
		
		System.out.println(s.balance);
		System.out.println(s1.balance);
		
	}
}
