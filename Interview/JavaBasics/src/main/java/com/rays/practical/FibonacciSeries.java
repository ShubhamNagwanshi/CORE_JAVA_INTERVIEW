package com.rays.practical;

public class FibonacciSeries {
public static void main(String[] args) {
	
	int x = 0;
	int y = 1;
	
	//System.out.println(x + "\n"+ y);
	
	for (int i = 0; i < 10; i++) {
		
		int z = x + y;
		
		x=y;
		y=z;
		
		System.out.println(z);
		
	}
}
}
