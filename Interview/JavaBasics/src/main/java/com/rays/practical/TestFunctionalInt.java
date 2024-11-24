package com.rays.practical;

public class TestFunctionalInt {
public static void main(String[] args) {
	FunctionalInt f = new FunctionalInt() {
		
		public int sum(int a, int b) {
			return a + b;
		}
	};
	int a = 20;
	int b = 10;
	
	System.out.println(f.sum(a, b));
}
}
