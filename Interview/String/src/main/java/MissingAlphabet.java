
public class MissingAlphabet {

public static void main(String[] args) {
		
		String name="shubham";
		
		for(char i='a'; i<='z'; i++) {
			if(name.indexOf(i)== -1) {
				
				System.out.print(i + " ");
			}
		}
	}

}
