package pratical;

public class TryWithFinally {
    public static void main(String[] args) {
        String s = "Shubham";

        try {
            s.charAt(10); // This will throw an exception
            System.out.println("try block");
          //  System.exit(1); // Replace 0 with 1 for an error indication
        } finally {
            System.out.println("end of program"); // This won't execute
        }
    }
}
