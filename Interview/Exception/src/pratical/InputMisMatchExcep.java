package pratical;

import java.util.InputMismatchException;

public class InputMisMatchExcep {
public static void main(String[] args) {
	
	String name = "dmin";
//	String password = "123";
	
	try {
		if(!name.matches("admin")) {
			throw new InputMismatchException("User is not admin");
		}
	}catch (InputMismatchException e) {
			System.out.println(e);
		}
	
	
}
}
