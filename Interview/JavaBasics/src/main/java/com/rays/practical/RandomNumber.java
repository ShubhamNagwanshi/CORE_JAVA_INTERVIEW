package com.rays.practical;

public class RandomNumber {
public static void main(String[] args) {
	
	for (int i = 1; i <=5; i++) {
		
		int j = (int)(Math.random()*100);
		
		System.out.println(j);
	}
}
}
