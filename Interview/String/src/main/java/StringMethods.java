
public class StringMethods {
public static void main(String[] args) {
	String name = "Shubh";
	String str = "Nagwanshi";

	System.out.println(name.length());
	System.out.println(name.charAt(3));
	System.out.println(name.indexOf("u"));
	System.out.println(name.indexOf("T"));
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.replace("u", "o"));
	System.out.println(name.concat(str));
	System.out.println(str.trim());

}
}
