package com.rays.practical;

public class TestFunctionIntLemda {
public static void main(String[] args) {
	
	FunctionalInt f =  (a, b) -> {
		return a+b;
	};
	int a = 20;
	int b = 10;
	System.out.println(f.sum(a, b));
}
}
