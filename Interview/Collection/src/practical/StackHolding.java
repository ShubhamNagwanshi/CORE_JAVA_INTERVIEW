package practical;

import java.util.Stack;

public class StackHolding {

	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		
		for(char i = 'a'; i<= 'z';i++) {
			System.out.print(s1.push(i) + " ");
		}
		System.out.println();
		
		Stack s2 = new Stack();
		
		while(!s1.isEmpty()) {
			System.out.print(s2.push(s1.pop()) + " ");
		}
	}
}
