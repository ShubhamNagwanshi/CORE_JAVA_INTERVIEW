
public class PalindromString {
public static void main(String[] args) {
        
        String name = "rotator";
        
        boolean flag = true;
        
        for (int i = 0; i < name.length() / 2; i++) { // Loop through half the string
            
            if(name.charAt(i) != name.charAt(name.length() - i - 1)) {
                flag = false; // Set flag to false if mismatch is found
                break; // Exit the loop early
            }
        }
        
        System.out.println("Palindrome = " + flag);
    }

}
