
public class CountOccuranceOfaChar {
public static void main(String[] args) {
	
	String name = "Shubham";
	 int count = 0;
	 
	 for (int i = 0; i < name.length(); i++) {
	
		 char ch = name.charAt(i);
		 
		 String s = String.valueOf(ch);
		 
		 if(s.matches("h")) {
			 count++;
		 }
	}
	 
	 System.out.println("h:" + count);
}
}
