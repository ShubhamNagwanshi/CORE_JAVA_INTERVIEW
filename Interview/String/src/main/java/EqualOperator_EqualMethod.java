
public class EqualOperator_EqualMethod {

	public static void main(String[] args) {

		String a = "Shubham";
		String b = "Shubham";
		String c = "Nagwanshi";
		String d = new String("Shubham");
		String e = new String("Shubham");
		String f = new String("Nagwanshi");
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a==e);
		System.out.println(a==f);
		
		
		System.out.println("6"+a.equals(b));
		System.out.println("7"+a.equals(c));
		System.out.println("8"+a.equals(d));
		System.out.println("9"+a.equals(e));
		System.out.println("10"+a.equals(f));
	}
}
