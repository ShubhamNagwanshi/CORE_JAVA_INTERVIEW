package streamAPI;

import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {
		
		Stream<String> stringStream = Stream.of("a","c","b");
		
		String[] stringArray = stringStream.toArray(e -> new String[e]);
		
		for(String string : stringArray) {
			System.out.println(string);
		}
//		System.out.println(stringArray[1]);
	}
}
