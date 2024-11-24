package com.rays.practical;

public class TestFunctionalIntMulti {
public static void main(String[] args) {
	
	FunctionalInt f = new FunctionalInt() {
		
		@Override
		public int sum(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	};
	int a = 20;
	int b = 10;
	
	System.out.println(f.sum(a, b));
	f.sub(a, b);
	FunctionalInt.multi(a, b);
}
}
