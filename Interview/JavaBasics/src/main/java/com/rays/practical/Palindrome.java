package com.rays.practical;

public class Palindrome {
public static void main(String[] args) {
	
	int a = 1221;
	int b = a;
	int c = 0;
	int d;
	
	while(b > 0) {
		d = b%10;
		c = c*10 + d;
		b = b/10;
		
	}
	
	if(a==c) {
		System.out.println("this is Palindrome");
	}else {
		System.out.println("this not Palindrome");
	}
}
}
