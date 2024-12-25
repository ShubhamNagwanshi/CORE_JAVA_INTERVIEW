package streamAPI;

import java.util.Arrays;
import java.util.List;

public class OddEven {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,5,22,11,45);
		
		l.stream().distinct().forEach(c -> {
			if(c % 2 == 0) {
				System.out.println(c + "-> Even Number");
			}else {
				System.out.println(c + " -> Odd Number");
			}
		});
	}
}
