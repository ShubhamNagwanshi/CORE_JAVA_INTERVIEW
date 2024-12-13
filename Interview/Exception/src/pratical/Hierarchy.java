package pratical;

public class Hierarchy {

	public static void main(String[] args) {
		
		try {
			int i = 10/0;
			
		}catch (Exception e) {
			System.out.println(e);
			/*
			 * }catch (ArithmeticException e) { System.out.println(e);// TODO: handle
			 * exception
			 */		}finally {
			System.out.println("Finally block");
		}
	}
}
