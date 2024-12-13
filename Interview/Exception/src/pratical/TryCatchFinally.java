package pratical;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		String s = null;
		
		try {
			System.out.println(s.length());
			
			
		} catch (NullPointerException e) {
			
			System.out.println(e);
			
		}finally {
			
			System.out.println("this is finally block");
		}
	}
}
