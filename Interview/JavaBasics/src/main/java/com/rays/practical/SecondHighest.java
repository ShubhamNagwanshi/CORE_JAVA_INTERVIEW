package com.rays.practical;

public class SecondHighest {
public static void main(String[] args) {
	
	int[] arr = {45,65,110,75,85};
	
	int a = 0;
	int b = 0;
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>b) {
			a=b;
			b= arr[i];
		}
		if(arr[i] < b && arr[i] > a) {
			a = arr[i];
		}
	}
	System.out.println(a);
}
}
