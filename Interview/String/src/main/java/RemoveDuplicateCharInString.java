
public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		
		/*
		 * String str1 = "Shubham"; String str = str1.toLowerCase();
		 * 
		 * for (int i = 0; i < str.length(); i++) {
		 * 
		 * char ch = str.charAt(i);
		 * 
		 * int dup = str.indexOf(ch , 1+1);
		 * 
		 * if(dup == -1) { System.out.println(ch); } }
		 * 
		 * char[] ch1 = str.toCharArray(); for(int ascii : ch1) { System.out.println(" "
		 * + ascii); }
		 */
		
		String str ="Shubhams";
		String str1 = str.toLowerCase();
		String result ="";
		
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if(result.indexOf(ch)==-1) {
				result+=ch;
			}
		}
		System.out.println(result);

	}
}
