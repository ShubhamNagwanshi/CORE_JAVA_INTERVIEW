package streamAPI;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		
		int[] i = {10,7,20,45,65,32};
		
		Arrays.stream(i).min().ifPresent(e -> System.out.println("Minimum Number = " + e));
		Arrays.stream(i).max().ifPresent(System.out::println);
	}
}
