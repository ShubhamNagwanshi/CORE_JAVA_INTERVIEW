
public class SortingOfString {

	public static void main(String[] args) {
		
		String name = "bddcaa";
		
		for(char a = 'a'; a<= 'z' ; a++) {
			for (int i = 0; i < name.length(); i++) {
				
				if(a == name.charAt(i)) {
					System.out.print(name.charAt(i));
				}
			}
		}
	}
}
